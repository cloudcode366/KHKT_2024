package com.wiramin.khkt.historymachine_2024.controller;

import com.wiramin.khkt.historymachine_2024.model.authentication.AuthenticationResponse;
import com.wiramin.khkt.historymachine_2024.model.authentication.RegisterRequest;
import com.wiramin.khkt.historymachine_2024.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    AuthenticationService authenticationService;

    @GetMapping("/getallacount")
    public ResponseEntity<?> getAllAccount() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getalllesson")
    public ResponseEntity<?> getAllLesson() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/registerteacher")
    public ResponseEntity<AuthenticationResponse> registerTeacher(
            @RequestBody RegisterRequest request
    ){
        AuthenticationResponse response = authenticationService.registerTeacher(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/deleteaccount/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable UUID id) {
        return ResponseEntity.ok().build();
    }
}
