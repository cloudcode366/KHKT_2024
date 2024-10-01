package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.entity.Lesson;

import java.util.List;

public interface LessonService {

    List<Lesson> getAllLessons();
    List<Lesson> getLessonsByStudentId(Long studentId);
    Lesson getLessonById(Long id);
    Lesson createLesson(Lesson lesson);
    Lesson updateLesson(Lesson lesson);
    void deleteLesson(Long id);
    void approveLesson(List<Long> ids);
    void rejectLesson(List<Long> ids);
}
