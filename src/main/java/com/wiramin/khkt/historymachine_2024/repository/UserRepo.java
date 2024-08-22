package com.wiramin.khkt.historymachine_2024.repository;

import com.wiramin.khkt.historymachine_2024.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {
    @Query("SELECT p.id FROM User p WHERE p.name = :username AND p.password = :password")
    UUID findIdByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
