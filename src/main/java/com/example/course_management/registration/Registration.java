package com.example.course_management.registration;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;   // Foreign key to Student
    private Long courseId;    // Foreign key to Course

    @NotBlank
    private String semester;  // e.g., "2025A", "2025B"

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
}
