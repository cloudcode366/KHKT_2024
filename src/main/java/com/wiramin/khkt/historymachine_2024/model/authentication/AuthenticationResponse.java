package com.wiramin.khkt.historymachine_2024.model.authentication;

import com.wiramin.khkt.historymachine_2024.Dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private UserDto userDto;
}
