package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
   List< User >readUserByEmail(String email);


    //Write a derived query to read a user with a username?

   List<User>readUserByUsername(String username);


    //Write a derived query to list all users that contain a specific name?
    List<User>findUsersByAccountNameContains(String name);


    //Write a derived query to list all users that contain a specific name in the ignore case mode?
    List<User>findUsersByAccount_NameContainingIgnoreCase(String name);


    //Write a derived query to list all users with an age greater than a specified age?
    List<User>findUsersByAccountAgeGreaterThan(Integer age);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?
    @Query("SELECT U FROM User U WHERE U.email=?1")
    List<User>returnAllUserByEmail(String email);


    //Write a JPQL query that returns a user read by username?
    @Query("SELECT U FROM User U WHERE U.username=?1")
    List<User>returnAllUserByUsername(String username);



    //Write a JPQL query that returns all users?
    @Query("SELECT U FROM User U")
    List<User>readAllUsers();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?
 @Query(value = "SELECT * FROM user_account uc JOIN account_details ad ON uc.account_details_id=ad.id WHERE ad.name  ILIKE concat('%',?1,'%')",nativeQuery = true)
 List<User>retrieveAllByName(@Param("name")String name);



    //Write a native query that returns all users?
  @Query(value ="SELECT * FROM user_account ",nativeQuery = true )
 List<User>retrieveAll();


    //Write a native query that returns all users in the range of ages?
 @Query(value = "SELECT * FROM user_account uc JOIN account_details ad ON uc.account_detail_id=ad.id WHERE age BETWEEN ?1 AND ?2",nativeQuery = true)
  List<User>retrieveBetweenAgeRange(@Param("age1")Integer age1,@Param("age2")Integer age2);


    //Write a native query to read a user by email?
 @Query(value = "SELECT * FROM user_account WHERE email=?1",nativeQuery = true)
   User retrieveByEmail(@Param("email")String email);


}