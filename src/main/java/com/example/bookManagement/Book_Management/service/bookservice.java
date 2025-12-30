package com.example.bookManagement.Book_Management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookManagement.Book_Management.model.book;
import com.example.bookManagement.Book_Management.repository.bookrepo;

@Service
public class bookservice {

    private final bookrepo repo;

    public bookservice(bookrepo repo) {
        this.repo = repo;
    }

    public book addBook(book b) {
        return repo.save(b);
    }

    public List<book> getAllBooks() {
        return repo.findAll();
    }

    public book updateBook(Long id, book b) {
        book existing = repo.findById(id).orElseThrow();
        existing.setTitle(b.getTitle());
        existing.setAuthor(b.getAuthor());
        return repo.save(existing);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
