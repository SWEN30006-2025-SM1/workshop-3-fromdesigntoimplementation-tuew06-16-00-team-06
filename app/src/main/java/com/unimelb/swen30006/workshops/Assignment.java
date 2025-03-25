package com.unimelb.swen30006.workshops;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {

    private String name;
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private List<Submission> submissions = new ArrayList<>();

    public Assignment(String name, String description, Date dueDate, int maxAttempts) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
    }

    public Submission[] invalidSubmissions() {
        return submissions.stream()
                .filter(s -> !s.isValid())
                .toArray(Submission[]::new);
    }

    public Submission[] validSubmissions() {
        return submissions.stream()
                .filter(Submission::isValid)
                .toArray(Submission[]::new);
    }

    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

}
