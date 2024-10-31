package com.example.demo;

import org.springframework.web.bind.annotation.*;  // Imports necessary Spring annotations

@RestController
@RequestMapping("/api")
public class PasswordController {

    @PostMapping("/password-quality")
    public String checkPasswordQuality(@RequestBody String password) {
        if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[!@#\\$%\\^&*].*")) {
            return "Strong";
        } else {
            return "Weak";
        }
    }
}
