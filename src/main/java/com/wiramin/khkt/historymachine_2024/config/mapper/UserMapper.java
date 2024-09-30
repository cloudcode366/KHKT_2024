package com.wiramin.khkt.historymachine_2024.config.mapper;

import com.wiramin.khkt.historymachine_2024.Dto.UserDto;
import com.wiramin.khkt.historymachine_2024.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "isEnabled", expression = "java(user.isEnabled())")
    UserDto userToUserDto(User user);
}
