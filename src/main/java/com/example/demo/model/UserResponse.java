package com.example.demo.model;

public class UserResponse {

    private String name;
    private int age;
    private String company;
    private String occupation;

    public UserResponse(String name, int age, String company, String occupation) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.occupation = occupation;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCompany() { return company; }
    public String getOccupation() { return occupation; }
}
