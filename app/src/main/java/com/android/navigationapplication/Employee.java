package com.android.navigationapplication;

public class Employee {

    private String name;
    private String surname;
    private String city;
    private String education;

    public Employee(String name, String surname, String city, String education) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
