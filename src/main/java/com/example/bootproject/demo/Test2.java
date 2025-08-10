package com.example.bootproject.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    @Data
    public static class UserDto {
        private Integer id;
        private String name;
        private String role;
    }

    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        userDto.setName("a");
        userDto.setRole("role1");
        UserDto userDto2 = new UserDto();
        userDto.setId(2);
        userDto.setName("b");
        userDto.setRole("role2");
        ArrayList<UserDto> list = new ArrayList<>();
        List<UserDto> userDtos = list.stream()
                .filter(userDto1 -> "a".equals(userDto1.getName()))
                .toList();
    }

}
