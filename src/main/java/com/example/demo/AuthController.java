package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AppUserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody AppUser user) {
        user.password = passwordEncoder.encode(user.password);
        userRepository.save(user);
        return "User registered: " + user.username;
    }

    @PostMapping("/login")
    public String login(@RequestBody AppUser user) {
        AppUser found = userRepository.findByUsername(user.username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (passwordEncoder.matches(user.password, found.password)) {
            return jwtUtil.generateToken(user.username);
        }
        return "Invalid credentials";
    }
}