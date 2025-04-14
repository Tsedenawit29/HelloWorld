package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;
@Entity
public class SoftwareEngineer {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private  String name;
    private String techStack;
    @Column(columnDefinition = "TEXT")
    private  String learningPathRecommendation;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(int id, String name, String techStack, String learningPathRecommendation) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
        this.learningPathRecommendation = learningPathRecommendation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setLearningPathRecommendation(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack) && Objects.equals(learningPathRecommendation, that.learningPathRecommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack, learningPathRecommendation);
    }
}
