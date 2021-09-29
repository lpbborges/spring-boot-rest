package com.example.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    "LP",
                    "lp@a.com",
                    LocalDate.of(1993, Month.JUNE, 13)
            );

            Student student2 = new Student(
                    "LP 2",
                    "lp2@a.com",
                    LocalDate.of(2000, Month.JUNE, 13)
            );

            repository.saveAll(
                    List.of(student1, student2)
            );
        };
    }
}
