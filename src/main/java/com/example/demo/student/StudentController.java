package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {

        return List.of(new Student(1L,
                "Cayenne",
                43,
                "cayenne@pepper.com",
                LocalDate.of(
                        1994,
                        Month.MAY,
                        20
                )), new Student(
                2L,
                "Paprika",
                21,
                "21canyoudosomething@forme.com",
                LocalDate.of(2012,Month.DECEMBER,5)
        ));
    }
}
