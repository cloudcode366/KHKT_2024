package com.wiramin.khkt.historymachine_2024.mapper;

import com.wiramin.khkt.historymachine_2024.dto.UserDto;
import com.wiramin.khkt.historymachine_2024.entity.User;
import com.wiramin.khkt.historymachine_2024.entity.Usertype;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "typeID", target = "usertype")
    User toEntity(UserDto dto);
    @Mapping(source = "usertype.type", target = "typeID")
    UserDto toDto(User entity);

    default Usertype map(int id) {
        if (id == 0) {
            return null;
        }
        Usertype userType = new Usertype();
        userType.setId(id);
        if(id== 1) {
            userType.setType("Student");
        } else if (id == 2) {
            userType.setType("Teacher");
        } else if (id == 3) {
            userType.setType("Admin");
        }
        return userType;
    }
}
