package com.wiramin.khkt.historymachine_2024.service.impl;

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
    public User getUser(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void approveUser(List<UUID> id) {
        for (UUID uuid : id) {
            User user = getUser(uuid);
            if (user != null) {
                user.setEnabled(true);
            }
        }
    }
}
