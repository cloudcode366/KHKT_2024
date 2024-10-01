package com.wiramin.khkt.historymachine_2024.repository;

import com.wiramin.khkt.historymachine_2024.entity.Role;
import com.wiramin.khkt.historymachine_2024.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(UUID uuid);
    Optional<List<User>> findUsersByRole(Role role);
}
