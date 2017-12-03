package com.lmonkiewicz.mongosandbox.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Items")
@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Item {

    @Field("ISBN")
    private String isbn;

    @Field("num_pages")
    private Integer numPages;

    @Builder
    public Book(String id, String name, String isbn, Integer numPages) {
        super(id, name);
        this.isbn = isbn;
        this.numPages = numPages;
    }

}
