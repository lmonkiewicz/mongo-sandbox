package com.lmonkiewicz.mongosandbox;

import lombok.Data;

@Data
public class AddBookRequest {
    private String name;
    private String isbn;
    private Integer numPages;

}
