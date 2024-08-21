package com.wiramin.khkt.historymachine_2024.Repository;

import com.wiramin.khkt.historymachine_2024.Entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PictureRepo extends JpaRepository<Picture, UUID> {
}
