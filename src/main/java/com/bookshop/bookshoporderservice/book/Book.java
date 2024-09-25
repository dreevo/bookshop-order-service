package com.bookshop.bookshoporderservice.book;

public record Book(
        String isbn,
        String title,
        String author,
        Double price
){}