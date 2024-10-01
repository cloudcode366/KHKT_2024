package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void deleteUser(UUID id);
    void updateUser(User user);
    User getAllUser(UUID id);
    List<User> getUsers();
    void approveUser(List<UUID> id);
    List<User> getAllStudent();
    List<User> getAllTeacher();
}
