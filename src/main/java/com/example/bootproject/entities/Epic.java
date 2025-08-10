package com.example.bootproject.entities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Epic extends Task{
    private Long projectId;
    private String productOwner;

    Epic(Long id, String name, String author, Long projectId, String productOwner) {
        this.projectId = projectId;
        this.productOwner = productOwner;
    }

    String getName() {
        return "NO NAME";
    }

}
