package com.techreturners.exercise002;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String city;


    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.firstName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
