package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> getStudents() {

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
