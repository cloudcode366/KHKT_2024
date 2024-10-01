package com.wiramin.khkt.historymachine_2024.controller;

import com.wiramin.khkt.historymachine_2024.model.Lesson.LessonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    @GetMapping("/getall")
    public ResponseEntity<?> getAllLesson() {
        return null;
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        return null;
    }
    @PostMapping("/upload")
    public ResponseEntity<?> uploadStudent(@RequestBody LessonRequest lessonRequest) {
        return null;
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody LessonRequest lessonRequest) {
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        return null;
    }
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("hello from student controller");
    }
}
