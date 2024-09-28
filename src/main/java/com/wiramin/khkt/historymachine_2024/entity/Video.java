package com.wiramin.khkt.historymachine_2024.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Video")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String path;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
