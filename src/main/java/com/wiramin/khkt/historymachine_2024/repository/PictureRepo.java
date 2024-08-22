package com.wiramin.khkt.historymachine_2024.repository;

import com.wiramin.khkt.historymachine_2024.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PictureRepo extends JpaRepository<Picture, UUID> {
}
