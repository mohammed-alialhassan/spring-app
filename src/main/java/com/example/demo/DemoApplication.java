package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<Student> hello() {

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
