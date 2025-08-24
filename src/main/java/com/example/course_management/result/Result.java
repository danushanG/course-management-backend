package com.example.course_management.result;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long registrationId;  // foreign key to Registration

    @NotBlank
    private String grade; // e.g., A, B+, C

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getRegistrationId() { return registrationId; }
    public void setRegistrationId(Long registrationId) { this.registrationId = registrationId; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
