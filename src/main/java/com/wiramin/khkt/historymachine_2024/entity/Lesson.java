package com.wiramin.khkt.historymachine_2024.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Lesson")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String rfid;
    private boolean approved;
    private boolean deleted;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Image> images;
    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Video> videos;

}
