package com.wiramin.khkt.historymachine_2024.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
public class UserDto {

    private String name;

    private Integer age;

    private String password;

    private int typeID;

}