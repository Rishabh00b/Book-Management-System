package com.example.bookManagement.Book_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookManagement.Book_Management.model.book;

public interface bookrepo extends JpaRepository<book, Long> {
}
