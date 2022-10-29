package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //Find all courses by category select(find) *  where(by) category=....
    List<Course>findByCategory(String category);
    //Find all courses by category and order the entities by name
    List<Course>findByCategoryOrderByName(String category);

    //Check if a course with the supplied name exists, false otherwise
    boolean existsByName(String name);

    //Return the courses that start with the given course name string
    int countByCategory(String category);
    List<Course>findByNameStartingWith(String name);

    //Return stream
    Stream<Course> streamAllByCategory(String category);
    @Query("SELECT c FROM Course c WHERE c.category=:category AND c.rating>:rating")
    List<Course>retrieveAllByCategoryAndRatingGreaterThan(@Param("category")String category,@Param("rating")int rating);



}
