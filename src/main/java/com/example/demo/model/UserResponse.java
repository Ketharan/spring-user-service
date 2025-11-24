package com.example.demo.model;

public class UserResponse {

    private String name;
    private int age;
    private String company;
    private String occupation;
    private String pseudoName; 
    private String password;   // ✅ added

    // Getters & Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPseudoName() {
        return pseudoName;
    }
    public void setPseudoName(String pseudoName) {
        this.pseudoName = pseudoName;
    }

    public String getPassword() {    // ✅ added
        return password;
    }
    public void setPassword(String password) {  // ✅ added
        this.password = password;
    }
}
