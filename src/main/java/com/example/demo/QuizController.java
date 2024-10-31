package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class QuizController {

    @GetMapping("/quiz")
    public List<String> getQuizQuestions() {
        return List.of("What is Java?", "Explain REST", "Define Spring Boot");
    }
}
