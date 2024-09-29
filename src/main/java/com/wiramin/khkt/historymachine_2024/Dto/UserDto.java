package com.wiramin.khkt.historymachine_2024.Dto;

import com.wiramin.khkt.historymachine_2024.entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phone;
    private boolean isEnabled;
    @Enumerated(EnumType.STRING)
    private Role role;
}
