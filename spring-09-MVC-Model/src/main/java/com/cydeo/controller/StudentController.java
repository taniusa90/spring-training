package com.cydeo.controller;

import com.cydeo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
        String subject= "Spring Boot";
        model.addAttribute("subject",subject);
        int studentId = new Random().nextInt();
        model.addAttribute("id",studentId);
        List<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        model.addAttribute("numbers",nums);

        LocalDate dt = LocalDate.now();
        model.addAttribute("date",dt);
        Student student =  new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        //method Model Interface
        return "student/welcome";

    }
}
