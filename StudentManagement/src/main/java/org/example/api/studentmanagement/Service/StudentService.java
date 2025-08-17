package org.example.api.studentmanagement.Service;

import org.example.api.studentmanagement.DTO.Studentdto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Studentdto> studentList = new ArrayList<>();

    public List<Studentdto> findAll() {
        return studentList;
    }

    public Studentdto findById(int id) {
        for (Studentdto s : studentList) {
            if (s.getid() == id) {
                return s;
            }
        }
        return null;
    }

    public void save(Studentdto studentdto) {
        studentList.add(studentdto);
    }

    public StudentService() {
        studentList.add(new Studentdto("Akshat", "Java Backend", 101));
        studentList.add(new Studentdto("Riya", "Spring Boot", 102));
        studentList.add(new Studentdto("Aman", "ReactJS", 103));
    }
}
