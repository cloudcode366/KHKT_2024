package com.wiramin.khkt.historymachine_2024.service.impl;

import com.wiramin.khkt.historymachine_2024.entity.Role;
import com.wiramin.khkt.historymachine_2024.entity.User;
import com.wiramin.khkt.historymachine_2024.repository.UserRepository;
import com.wiramin.khkt.historymachine_2024.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getAllUser(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void approveUser(List<UUID> id) {
        for (UUID uuid : id) {
            User user = getAllUser(uuid);
            if (user != null) {
                user.setEnabled(true);
            }
        }
    }

    @Override
    public List<User> getAllStudent() {
        return userRepository.findUsersByRole(Role.STUDENT).orElse(null);
    }

    @Override
    public List<User> getAllTeacher() {
        return userRepository.findUsersByRole(Role.TEACHER).orElse(null);
    }
}
