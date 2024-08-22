package com.wiramin.khkt.historymachine_2024.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usertype")
public class Usertype {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO) // Hoặc UUID nếu dùng UUID
    private Integer id;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

}