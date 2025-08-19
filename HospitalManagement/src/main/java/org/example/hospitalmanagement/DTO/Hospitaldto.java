package org.example.hospitalmanagement.DTO;

public class Hospitaldto {
    private int id;
    private String name;
    private String city;
    private String phone;
    private int age;

    public Hospitaldto(int id,String name, String city, String phone, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.age = age;
    }

    public Hospitaldto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
