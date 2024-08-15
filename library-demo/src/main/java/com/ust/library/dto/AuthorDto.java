package com.ust.library.dto;

import com.ust.library.model.Book;

import java.util.List;

public record AuthorDto(
        long id,
        String name,
        List<Book> books
) {
}
