package com.example.bootproject.entities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppUser {

    private String login;
    private String firstName;
    private String lastName;

    AppUser(Long sessionId, String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getLogin() {
        return login;
    }

}
