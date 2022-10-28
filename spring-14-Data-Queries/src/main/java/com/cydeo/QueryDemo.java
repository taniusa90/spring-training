package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {
    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("findByCountry:"+regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining:"+regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByRegionRegionDesc:"+regionRepository.findByCountryContainingOrderByRegionDesc("United"));
        System.out.println("findTopByCountry"+regionRepository.findTopByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion"+regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("-------------------");
        System.out.println("findByDepartment"+departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision"+departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndingWith"+departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains"+departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("-----Employees-----");

        System.out.println(employeeRepository.retrieveEmployeeDetail());
        System.out.println(employeeRepository.retrieveEmployeeSalary());







    }
}
