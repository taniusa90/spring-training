package com.cydeo.repository;

import com.cydeo.entity.Movie;
import com.cydeo.enums.MovieState;
import com.cydeo.enums.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name
    Optional<Movie> readAllByName(String name);


    //Write a derived query to list all movies between a range of prices
    List<Movie>findMovieByPriceBetween(BigDecimal price1,BigDecimal price2);


    //Write a derived query to list all movies where duration exists in the specific list of duration
    List<Movie>findAllByDurationIn(List<Integer> duration);


    //Write a derived query to list all movies with higher than a specific release date
    List<Movie>findByReleaseDateAfter(LocalDate date);

    //Write a derived query to list all movies with a specific state and type
    List<Movie>findByStateAndType(MovieState movieState, MovieType movieType);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices
    @Query( "SELECT m FROM Movie m where m.price BETWEEN ?1 AND ?2")
    List<Movie>listAllMovies(BigDecimal price1,BigDecimal price2);


    //Write a JPQL query that returns all movie names
    @Query("SELECT DISTINCT m.name FROM Movie m ")
    List<String>returnsAllMovieByNames();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name
    @Query(value = "SELECT * FROM Movie WHERE Movie.name=?1",nativeQuery = true)
    List<Movie>returnsMovieByName(String name);//Optional instead of List


    //Write a native query that return the list of movies in a specific range of prices
    @Query(value = "SELECT * FROM Movie WHERE price BETWEEN ?1 AND ?2",nativeQuery = true)
    List<Movie>returnListOfMovie(BigDecimal price1,BigDecimal price2);


    //Write a native query to return all movies where duration exists in the range of duration
    @Query(value = "SELECT * FROM Movie WHERE duration IN ?1",nativeQuery = true)
    List<Movie>returnAllMovieByDuration(@Param("duration") List<Integer> duration);


    //Write a native query to list the top 5 most expensive movies
    @Query(value = "SELECT * from Movie ORDER BY price DESC Limit 5",nativeQuery = true)
    List<Movie>retrieveExpensiveMovies();


}