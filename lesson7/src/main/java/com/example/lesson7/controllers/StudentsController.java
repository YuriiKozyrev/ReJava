package com.example.lesson7.controllers;

import com.example.lesson7.entities.Student;
import com.example.lesson7.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentsController {
    private StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService){
        this.studentsService = studentsService;
    }

    @GetMapping
    public String showAll(Model model){
        List<Student> students = studentsService.findAll();
        model.addAttribute("students", students);
        return "all_students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentsService.findById(id));
        return "edit_student_form";
    }

    @PostMapping("/edit")
    public String modifyStudent(@ModelAttribute Student student) {
        studentsService.saveOrUpdate(student);
        return "redirect:/students/";
    }

    @GetMapping("/add")
    public String showAddStudentForm(){
        return "add_student_form";
    }

    @PostMapping("/add")
    public String saveNewStudent(@ModelAttribute Student student){
        studentsService.saveOrUpdate(student);
        return "redirect:/students/";
    }

    @GetMapping("/del/{id}")
    public String delStudent(@PathVariable Long id) {
        studentsService.deleteById(id);
        return "redirect:/students/";
    }



}
