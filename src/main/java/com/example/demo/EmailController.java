package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api")
public class EmailController {

    @PostMapping("/email-check")
    public String checkEmailValidity(@RequestBody String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return "Valid email";
        } else {
            return "Invalid email";
        }
    }
}
