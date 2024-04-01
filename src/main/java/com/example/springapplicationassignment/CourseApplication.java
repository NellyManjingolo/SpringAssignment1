package com.example.springapplicationassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }
}

@RestController
class CourseController {

    @GetMapping("/courses")
    public CourseData getCourses() {
        List<String> foundationCourses = Arrays.asList("Introduction to Computer Science", "Fundamentals of Programming");
        List<String> undergraduateCourses = Arrays.asList("Data Structures", "Algorithms", "Computer Networks", "Database Systems", "Operating Systems");
        List<String> honorsCourses = Arrays.asList("Advanced Algorithms", "Machine Learning", "Computer Security", "Software Engineering");

        return new CourseData(foundationCourses, undergraduateCourses, honorsCourses);
    }
}

class CourseData {
    private List<String> foundationCourses;
    private List<String> undergraduateCourses;
    private List<String> honorsCourses;

    public CourseData(List<String> foundationCourses, List<String> undergraduateCourses, List<String> honorsCourses) {
        this.foundationCourses = foundationCourses;
        this.undergraduateCourses = undergraduateCourses;
        this.honorsCourses = honorsCourses;
    }

    // Getters and setters
    public List<String> getFoundationCourses() {
        return foundationCourses;
    }

    public void setFoundationCourses(List<String> foundationCourses) {
        this.foundationCourses = foundationCourses;
    }

    public List<String> getUndergraduateCourses() {
        return undergraduateCourses;
    }

    public void setUndergraduateCourses(List<String> undergraduateCourses) {
        this.undergraduateCourses = undergraduateCourses;
    }

    public List<String> getHonorsCourses() {
        return honorsCourses;
    }

    public void setHonorsCourses(List<String> honorsCourses) {
        this.honorsCourses = honorsCourses;
    }
}
