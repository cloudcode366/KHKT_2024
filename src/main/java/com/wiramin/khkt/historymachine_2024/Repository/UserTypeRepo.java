package com.wiramin.khkt.historymachine_2024.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wiramin.khkt.historymachine_2024.Entity.Usertype;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserTypeRepo extends JpaRepository<Usertype, UUID> {
}