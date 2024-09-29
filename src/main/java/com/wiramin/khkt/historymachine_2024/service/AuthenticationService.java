package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.model.AuthenticationRequest;
import com.wiramin.khkt.historymachine_2024.model.AuthenticationResponse;
import com.wiramin.khkt.historymachine_2024.model.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse login(AuthenticationRequest request);
}
