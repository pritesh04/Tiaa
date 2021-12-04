package com.example.Demo.controller;

import com.example.Demo.domain.Student;
import com.example.Demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class student {
//    @RequestMapping("/new")
//    public String add(Model model)
//    {
//
//        return "new";
//    }
    @Autowired
private StudentService service;

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student std) {
        service.save(std);
        return "new";
    }
}
