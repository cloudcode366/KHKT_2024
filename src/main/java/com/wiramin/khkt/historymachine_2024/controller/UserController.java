package com.wiramin.khkt.historymachine_2024.controller;

import com.wiramin.khkt.historymachine_2024.dto.UserDto;

import com.wiramin.khkt.historymachine_2024.mapper.UserMapper;
import com.wiramin.khkt.historymachine_2024.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {
        userService.register(userMapper.toEntity(userDto));
        return ResponseEntity.ok(userDto);
    }
    @GetMapping("/login")
    public ResponseEntity<UUID> login(@RequestBody String username, @RequestBody String password) {
        return ResponseEntity.ok(userService.login(username, password));
    }
}
