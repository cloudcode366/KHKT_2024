package com.wiramin.khkt.historymachine_2024.repository;

import com.wiramin.khkt.historymachine_2024.entity.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChampionRepo extends JpaRepository<Champion, UUID> {
}
