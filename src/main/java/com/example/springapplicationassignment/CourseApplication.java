

































































package com.example.springapplicationassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

    @RestController
    public class CourseController {

        @GetMapping("/courses/foundation")
        @ResponseBody
        public String getFoundationCourses() {
            List<String> foundationCourses = Arrays.asList("Introduction to Computer Science", "Fundamentals of Programming");
            return generateCourseList("Foundation Courses", foundationCourses);
        }

        @GetMapping("/courses/undergraduate")
        @ResponseBody
        public String getUndergraduateCourses() {
            List<String> undergraduateCourses = Arrays.asList("Data Structures", "Algorithms", "Computer Networks", "Database Systems", "Operating Systems");
            return generateCourseList("Undergraduate Courses", undergraduateCourses);
        }

        @GetMapping("/courses/honors")
        @ResponseBody
        public String getHonorsCourses() {
            List<String> honorsCourses = Arrays.asList("Advanced Algorithms", "Machine Learning", "Computer Security", "Software Engineering");
            return generateCourseList("Honors Courses", honorsCourses);
        }

        @GetMapping("/courses/all")
        @ResponseBody
        public String getAllCourses() {
            List<String> foundationCourses = Arrays.asList("Introduction to Computer Science", "Fundamentals of Programming");
            List<String> undergraduateCourses = Arrays.asList("Data Structures", "Algorithms", "Computer Networks", "Database Systems", "Operating Systems");
            List<String> honorsCourses = Arrays.asList("Advanced Algorithms", "Machine Learning", "Computer Security", "Software Engineering");

            StringBuilder sb = new StringBuilder();
            sb.append("<h1>Foundation Courses</h1>");
            sb.append("<ul>");
            for (String course : foundationCourses) {
                sb.append("<li>").append(course).append("</li>");
            }
            sb.append("</ul>");

            sb.append("<h1>Undergraduate Courses</h1>");
            sb.append("<ul>");
            for (String course : undergraduateCourses) {
                sb.append("<li>").append(course).append("</li>");
            }
            sb.append("</ul>");

            sb.append("<h1>Honors Courses</h1>");
            sb.append("<ul>");
            for (String course : honorsCourses) {
                sb.append("<li>").append(course).append("</li>");
            }
            sb.append("</ul>");

            return sb.toString();
        }

        private String generateCourseList(String title, List<String> courses) {
            StringBuilder sb = new StringBuilder();
            sb.append("<h1>").append(title).append("</h1>");
            sb.append("<ul>");
            for (String course : courses) {
                sb.append("<li>").append(course).append("</li>");
            }
            sb.append("</ul>");
            return sb.toString();
        }
    }
}

