package org.example.dsbook;

import org.example.dsbook.dto.BookDto;
import org.example.dsbook.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DsBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsBookApplication.class, args);
    }


    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            // Liste des livres à ajouter
            List<BookDto> books = List.of(
                    BookDto.builder().titre("Model 1").publisher("Red").datePublication("2023-01-01").price(12345).resume("Résumé 1").build(),
                    BookDto.builder().titre("Model 2").publisher("Blue").datePublication("2022-12-15").price(54321).resume("Résumé 2").build(),
                    BookDto.builder().titre("Model 3").publisher("Green").datePublication("2023-05-20").price(98765).resume("Résumé 3").build(),
                    BookDto.builder().titre("Model 4").publisher("Yellow").datePublication("2021-11-10").price(56789).resume("Résumé 4").build()
            );

            for (BookDto bookDto : books) {
                bookService.saveBook(bookDto);
            }
        };
    }


}
