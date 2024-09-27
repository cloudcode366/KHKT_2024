package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.entity.User;

public interface JwtService {
    String extractUsername(String token);
    String generateToken(User user);
}
