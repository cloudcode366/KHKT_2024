package com.wiramin.khkt.historymachine_2024.Repository;

import com.wiramin.khkt.historymachine_2024.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for managing Video entities.
 * Extends the JpaRepository interface to provide standard CRUD operations for Video entities.
 * The UUID type is used as the primary key for Video entities.
 */
@Repository
public interface VideoRepo extends JpaRepository<Video, UUID> {
}
