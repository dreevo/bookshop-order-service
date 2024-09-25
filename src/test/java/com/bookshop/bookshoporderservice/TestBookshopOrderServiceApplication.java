package com.bookshop.bookshoporderservice;

import org.springframework.boot.SpringApplication;

public class TestBookshopOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(BookshopOrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
