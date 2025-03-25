package com.unimelb.swen30006.workshops;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.setName(name);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void sendEmailMsg(String message) {
        System.out.println("Sending email to" + email+ ": " + message);
    }

    public float totalScore() {

        return 0.0f;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}