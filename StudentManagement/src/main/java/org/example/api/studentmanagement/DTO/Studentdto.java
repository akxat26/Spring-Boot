package org.example.api.studentmanagement.DTO;


public class Studentdto {
    private  String name;
    private String course;
    private  int id;

    public Studentdto(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public Studentdto(String name, String course) {
        this.name = name;
        this.course = course;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        course = course;
    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }
}
