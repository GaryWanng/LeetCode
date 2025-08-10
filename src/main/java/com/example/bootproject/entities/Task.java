package com.example.bootproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public abstract class Task {

    private Long id;
    private String name;
    private String author;

    String getName() {
        return name;
    }

}
