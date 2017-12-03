package com.lmonkiewicz.mongosandbox;

import com.lmonkiewicz.mongosandbox.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@Slf4j
public class BooksController {

    private final BookRepository bookRepository;

    @Autowired
    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public String addNew(@RequestBody AddBookRequest request) {
        final Book book = Book.builder()
                .name(request.getName())
                .isbn(request.getIsbn())
                .numPages(request.getNumPages())
                .build();
        log.info("Saving book {}", book);
        final Book saved = bookRepository.save(book);

        log.info("Saved as {}", saved);
        return saved.getId();
    }

    @GetMapping("/{id}")
    public Book findBook(@PathVariable String id) {
        final Book book = bookRepository.findOne(id);
        log.info("Found book {}", book);
        return book;
    }
}
