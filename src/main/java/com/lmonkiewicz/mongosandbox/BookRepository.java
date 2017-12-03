package com.lmonkiewicz.mongosandbox;

import com.lmonkiewicz.mongosandbox.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
