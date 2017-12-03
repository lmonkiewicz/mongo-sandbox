package com.lmonkiewicz.mongosandbox.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public abstract class Item {

    @Id
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
