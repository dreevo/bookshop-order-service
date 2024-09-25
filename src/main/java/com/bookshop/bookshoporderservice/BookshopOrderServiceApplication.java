package com.bookshop.bookshoporderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BookshopOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopOrderServiceApplication.class, args);
    }

}
