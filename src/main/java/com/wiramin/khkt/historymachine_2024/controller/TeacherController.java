package com.wiramin.khkt.historymachine_2024.controller;

import com.wiramin.khkt.historymachine_2024.model.Lesson.LessonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/teacher")
@RequiredArgsConstructor
public class TeacherController {

    @GetMapping("/getalllesson")
    public ResponseEntity<?> GetAllLesson() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getallstudent")
    public ResponseEntity<?> GetAllStudent() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/approvelesson")
    public ResponseEntity<?> approvelesson(@RequestBody List<Long> ids) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/approvestudent")
    public ResponseEntity<?> approveStudent(@RequestBody List<UUID> ids) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestBody LessonRequest lessonRequest ) {
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/deletelesson")
    public ResponseEntity<?> deleteLesson(@RequestBody List<Long> ids) {
        return ResponseEntity.ok().build();
    }
}
