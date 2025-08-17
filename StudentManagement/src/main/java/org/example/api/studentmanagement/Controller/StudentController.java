package org.example.api.studentmanagement.Controller;

import org.example.api.studentmanagement.DTO.Studentdto;
import org.example.api.studentmanagement.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
class StudentViewController {

    private final StudentService studentService;

    public StudentViewController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✅ Show all students in a web page
    @GetMapping
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students"; // will load students.html
    }

    // ✅ Handle form submission
    @PostMapping("/add")
    public String addStudent(@RequestParam String name, @RequestParam String course) {
        studentService.save(new Studentdto(name, course));
        return "redirect:/students"; // reload page after saving
    }
}
