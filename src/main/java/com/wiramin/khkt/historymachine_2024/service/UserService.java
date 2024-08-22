package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.dto.UserDto;
import com.wiramin.khkt.historymachine_2024.entity.User;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface UserService {
    UUID login(String username, String password);
    UserDto register(User user);
}
