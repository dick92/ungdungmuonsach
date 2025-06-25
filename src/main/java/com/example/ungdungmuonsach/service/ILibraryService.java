package com.example.ungdungmuonsach.service;

import com.example.ungdungmuonsach.model.Book;

import java.util.List;

public interface ILibraryService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    String borrowBook(Long bookId);
    void returnBook(String code);
}
