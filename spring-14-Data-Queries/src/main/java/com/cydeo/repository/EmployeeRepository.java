package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Display all employees with email address
    List<Employee>findByEmail(String email);

    //Display all employee with firstname " and lastname""and also show employee with a email address
    List<Employee>findByFirstNameAndLastNameOrEmail(String firstname,String lastname,String email);

    //Display all employees that firstname is not""
    List<Employee>findByFirstNameIsNot(String firstName);

    //Display all employees where lastName start with ""
    List<Employee>findByLastNameStartsWith(String lastName);

    //Display all employees with salary less than ""
    List<Employee>findBySalaryLessThan(Integer salary);

    //Display all employees with salary higher than ""
    List<Employee>findBySalaryGreaterThan(Integer salary);

    //Display all employee that has been hired between"" and""
    List<Employee>findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all employees where salary d and equal to order
    List<Employee>findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employee that is making less than
    List<Employee>findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that the email address is not
    List<Employee>findByEmailIsNull();

    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email= 'amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee>retrieveEmployeeSalaryNotEqual(int salary);

    //Like/Contains/Startswiths/Endwiths
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee>retrieveEmployeeFirstNameLike(String pattern);

    //Less Than
    @Query("SELECT e FROM Employee  e WHERE e.salary < ?1")
    List<Employee>retrieveEmployeeSalaryLessThan(int salary);

    //Greater Than
    @Query("SELECT e.firstName FROM Employee  e WHERE e.salary > ?1")
    List<Employee>retrieveEmployeeSalaryGreaterThan(int salary);

    //Between
    @Query("SELECT e FROM Employee  e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee>retrieveEmployeeSalaryBetween(int salary1,int salary2);

    //Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate >?1")
    List<Employee>retrieveEmployeeHireDateBefore(LocalDate date);

    //NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL ")
    List<Employee>retrieveEmployeeIsNull();

    //NOT NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL ")
    List<Employee>retrieveEmployeeIsNotNull();

    //Sorting in ASC Ord
    @Query("SELECT e FROM Employee e  ORDER BY e.salary")
    List<Employee>retrieveEmployeeSalaryOrderAs();

    @Query("SELECT e FROM Employee e  ORDER BY e.salary DESC ")
    List<Employee>retrieveEmployeeSalaryOrderDesc();

    //NATIVE Query
    @Query(value = "SELECT * FROM Employee WHERE salary =?1",nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);















}
