package com.java.StudentApplication;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examination_result")
public class ExaminationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private Integer grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    // ... геттеры и сеттеры ...

    @Override
    public String toString() {
        return "ExaminationResult{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", student=" + student +
                '}';
    }
}
