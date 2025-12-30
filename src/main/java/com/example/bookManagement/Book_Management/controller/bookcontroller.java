package com.example.bookManagement.Book_Management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bookManagement.Book_Management.model.book;
import com.example.bookManagement.Book_Management.service.bookservice;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class bookcontroller {

    private final bookservice service;

    public bookcontroller(bookservice service) {
        this.service = service;
    }

    // POST /books
    @PostMapping
    public book addBook(@RequestBody book b) {
        return service.addBook(b);
    }

    // GET /books
    @GetMapping
    public List<book> getBooks() {
        return service.getAllBooks();
    }

    // PUT /books/{id}
    @PutMapping("/{id}")
    public book updateBook(@PathVariable Long id, @RequestBody book b) {
        return service.updateBook(id, b);
    }

    // DELETE /books/{id}
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }
}
