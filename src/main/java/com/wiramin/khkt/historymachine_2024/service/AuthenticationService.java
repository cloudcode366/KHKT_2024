package com.wiramin.khkt.historymachine_2024.service;

import com.wiramin.khkt.historymachine_2024.model.authentication.AuthenticationRequest;
import com.wiramin.khkt.historymachine_2024.model.authentication.AuthenticationResponse;
import com.wiramin.khkt.historymachine_2024.model.authentication.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse login(AuthenticationRequest request);
    AuthenticationResponse registerTeacher(RegisterRequest request);
}
