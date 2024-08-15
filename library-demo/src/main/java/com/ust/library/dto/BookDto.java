package com.ust.library.dto;

import com.ust.library.model.Author;

public record BookDto(
        long id,
        String title,
        String isbn,
        Author author
) {
}
