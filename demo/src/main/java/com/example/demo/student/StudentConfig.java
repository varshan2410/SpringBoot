package com.example.demo.student;

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
            Student varshan = new Student(
                    "Varshan",
                    "varshan@gmail.com",
                    LocalDate.of(2002, Month.OCTOBER, 24),
                    22
            );

            Student laksan = new Student(
                    "Laksan",
                    "Laksan@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 20),
                    23
            );

            repository.saveAll(
                    List.of(varshan,laksan)
                    );
        };
    }
}
