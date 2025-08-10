package com.example.bootproject.entities;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public abstract class Person {
    @Id
    @GeneratedValue
    private Long id;
    private Long sessionId;
}