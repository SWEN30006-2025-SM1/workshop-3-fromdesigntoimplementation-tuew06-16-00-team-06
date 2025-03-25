package com.unimelb.swen30006.workshops;
import java.sql.Date;
import java.util.List;

public class Subject {

    private String name;
    private String subjectCode;
    private List<Assignment> assignments;

    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }

    public void createAssignment(String assignmentCode, String description, Date dueDate, int maxAttempts, String subjectCode) {
        Assignment assignment = new Assignment(name, description, dueDate, maxAttempts);
        assignments.add(assignment);
    }

    public void deleteAssignment(String assignmentCode) {
        assignments.remove(assignmentCode);
    }
}
