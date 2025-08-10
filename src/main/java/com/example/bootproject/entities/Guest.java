package com.example.bootproject.entities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Guest {
    @Id
    @GeneratedValue
    private Long id;
    private String tempName;

    Guest(Long sessionId, String tempName) {
        this.tempName = tempName;
    }

    String getTempName() {
        return tempName;
    }
}
