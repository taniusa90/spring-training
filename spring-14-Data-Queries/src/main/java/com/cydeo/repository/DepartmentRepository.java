package com.cydeo.repository;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all departments in the Furniture Department

    List<Department> findByDepartment(String furniture);
    //Display all departments in Health Division
    List<Department> findByDivision(String Division);
    List<Department>findByDivisionIs(String division);
    List<Department>findByDivisionEquals(String division);

    //Display all departments with division name end with "ics
    List<Department>findByDivisionEndingWith(String division);

    //Display top 3 departments with division name includes 'Hea' without duplication
    List<Department>findDistinctTop3ByDivisionContains(String pattern);
    @Query("SELECT d FROM Department d WHERE d.division IN ?1" )

    List<Department>retrieveDepartmentDivision(List<String>division);

    //Named Parameter
    @Query("SELECT e FROM Employee e WHERE e.salary=:salary")
    List<Employee>retrieveEmployeeSalary(@Param("salary") int salary);





}
