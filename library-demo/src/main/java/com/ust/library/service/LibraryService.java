package com.ust.library.service;

import com.ust.library.model.Author;
import com.ust.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface LibraryService {

    List<Author> getAllAuthors();

    Optional<Author> getAuthorById(long id);

    Author saveAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthor(long id);

    List<Book> getAllBooks();

    Optional<Book> getBookById(long id);

    Book saveBook(Book book);

    Book updateBook(Book book);

    void deleteBook(long id);
}
