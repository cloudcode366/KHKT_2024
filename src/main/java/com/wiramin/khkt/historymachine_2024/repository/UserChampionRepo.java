package com.wiramin.khkt.historymachine_2024.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wiramin.khkt.historymachine_2024.entity.Userchampion;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserChampionRepo extends JpaRepository<Userchampion, UUID> {}
