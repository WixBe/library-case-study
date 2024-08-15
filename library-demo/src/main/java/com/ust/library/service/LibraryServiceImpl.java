package com.ust.library.service;

import com.ust.library.model.Author;
import com.ust.library.model.Book;
import com.ust.library.repository.AuthorRepository;
import com.ust.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.saveAndFlush(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        if (authorRepository.findById(author.getId()).isPresent()) {
            return authorRepository.saveAndFlush(author);
        } else {
            throw new RuntimeException("Author not found");
        }
    }

    @Override
    public void deleteAuthor(long id) {
        if (authorRepository.findById(id).isPresent()) {
            authorRepository.deleteById(id);
        } else {
            throw new RuntimeException("Author not found");
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public Book updateBook(Book book) {
        if (bookRepository.findById(book.getId()).isPresent()) {
            return bookRepository.saveAndFlush(book);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    @Override
    public void deleteBook(long id) {
        if (bookRepository.findById(id).isPresent()) {
            bookRepository.deleteById(id);
        } else {
            throw new RuntimeException("Book not found");
        }
    }
}
