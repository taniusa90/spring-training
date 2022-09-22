package com.cydeo.controller;

import com.cydeo.entity.Mentor;
import com.cydeo.enums.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.Male));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.Male));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.Female));


        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";

    }




}
