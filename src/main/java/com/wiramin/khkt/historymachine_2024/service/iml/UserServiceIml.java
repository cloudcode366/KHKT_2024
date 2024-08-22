package com.wiramin.khkt.historymachine_2024.service.iml;

import com.wiramin.khkt.historymachine_2024.dto.UserDto;
import com.wiramin.khkt.historymachine_2024.entity.User;
import com.wiramin.khkt.historymachine_2024.mapper.UserMapper;
import com.wiramin.khkt.historymachine_2024.repository.UserRepo;
import com.wiramin.khkt.historymachine_2024.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UserServiceIml implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;
    public UserServiceIml(UserRepo userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
    }

    @Override
    public UUID login(String username, String password) {
        UUID uuid = userRepo.findIdByUsernameAndPassword(username, password);
        if (uuid != null) {
            return uuid;
        }
        return null;
    }

    @Override
    public UserDto register(User user) {
        userRepo.save(user);
        return userMapper.toDto(user);
    }
}
