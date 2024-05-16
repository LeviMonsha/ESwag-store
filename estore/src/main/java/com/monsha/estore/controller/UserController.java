package com.monsha.estore.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.monsha.estore.model.Test;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "user_methods")
@RestController
public class UserController {
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/")
    public String getAllUsers() {
        return "Get all users";
    }

    @PostMapping("/")
    public String createUser() {
        return "Create user";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id) {
        return "Update user " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Delete user " + id;
    }
}
