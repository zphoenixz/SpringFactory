package com.factory.controller;

import com.factory.model.request.UserRequest;
import com.factory.model.response.UserResponse;
import com.factory.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @PostMapping("/")
    public UserResponse createUser(@Validated @RequestBody UserRequest user) {
        return service.create(user);
    }

    @GetMapping("/all")
    public List<UserResponse> getAllUsers() {
        return service.getAll();
    }
}
