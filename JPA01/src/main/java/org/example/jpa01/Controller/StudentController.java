package org.example.jpa01.Controller;

import org.example.jpa01.Entity.Student;
import org.example.jpa01.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController
{
    @Autowired
    private StudentService studentService;

//    @Autowired
    //Student student;

    @DeleteMapping("/del/{id}")
    public Student deleteById(@PathVariable int  id)
    {
        return studentService.deleteStudent(id);
    }
     @GetMapping("find/{id}")
     public Student findStudentById(@PathVariable int id)
     {
         return studentService.findStudent(id);
     }

     @GetMapping("/all")
     public List<Student> findAllStudents()
     {
         List<Student> allstudent =studentService.getAllStudents();
         return allstudent;
     }

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
}
