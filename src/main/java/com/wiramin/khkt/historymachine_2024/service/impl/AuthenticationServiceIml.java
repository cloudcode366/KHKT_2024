package com.wiramin.khkt.historymachine_2024.service.impl;

import com.wiramin.khkt.historymachine_2024.Dto.UserDto;
import com.wiramin.khkt.historymachine_2024.config.mapper.UserMapper;
import com.wiramin.khkt.historymachine_2024.entity.Role;
import com.wiramin.khkt.historymachine_2024.entity.User;
import com.wiramin.khkt.historymachine_2024.model.authentication.AuthenticationRequest;
import com.wiramin.khkt.historymachine_2024.model.authentication.AuthenticationResponse;
import com.wiramin.khkt.historymachine_2024.model.authentication.RegisterRequest;
import com.wiramin.khkt.historymachine_2024.repository.UserRepository;
import com.wiramin.khkt.historymachine_2024.service.AuthenticationService;
import com.wiramin.khkt.historymachine_2024.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceIml implements AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;
    @Override
    public AuthenticationResponse register(RegisterRequest request) {
        User newUser = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.STUDENT)
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .phone(request.getPhone())
                .isEnabled(false)
                .build();
        User createdUser = userRepository.save(newUser);
        String jwtToken = jwtService.generateToken(createdUser);
        return AuthenticationResponse.builder()
                .userDto(userMapper.userToUserDto(createdUser))
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponse login(AuthenticationRequest request) {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );
        }
        catch (Exception e) {
            throw new RuntimeException("Username, password wrong");
        }
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        UserDto userDto = userMapper.userToUserDto(user);
        return AuthenticationResponse.builder()
                .userDto(userDto)
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponse registerTeacher(RegisterRequest request) {
        User newUser = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.TEACHER)
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .phone(request.getPhone())
                .isEnabled(true)
                .build();
        User createdUser = userRepository.save(newUser);
        String jwtToken = jwtService.generateToken(createdUser);
        return AuthenticationResponse.builder()
                .userDto(userMapper.userToUserDto(createdUser))
                .token(jwtToken)
                .build();
    }
}
