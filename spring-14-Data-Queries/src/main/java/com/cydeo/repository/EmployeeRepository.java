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

    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'" )
    Employee retrieveEmployeeDetail();
  @Query("SELECT e.salary FROM Employee e WHERE e.email= 'amcnee1@google.es'")
   Integer retrieveEmployeeSalary();





}
