package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.MONTH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student cayenne = new Student(
                    "Cayenne",
                    43,
                    "cayenne@pepper.com",
                    LocalDate.of(
                            1994,
                            Month.MAY,
                            20
                    ));

           Student paprika = new Student(
                    "Paprika",
                    21,
                    "21canyoudosomething@forme.com",
                    LocalDate.of(2012,Month.DECEMBER,5)
            );

           repository.saveAll(
                   List.of(cayenne, paprika)
           );
        };
    }
}
