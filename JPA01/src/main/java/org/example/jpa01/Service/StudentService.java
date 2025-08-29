package org.example.jpa01.Service;
import org.example.jpa01.Entity.Student;
import org.example.jpa01.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    StudentRepo studentRepo;

    public Student deleteStudent(int id)
    {
        studentRepo.deleteById(id);
        return null;
    }

    public Student saveStudent(Student student)
   {
       return studentRepo.save(student);
   }

   public Student findStudent(int id)
   {
       return studentRepo.findById(id).orElse(null);
   }

   public List<Student> getAllStudents()
   {
       List<Student> students = studentRepo.findAll();
       return students;
   }

}
