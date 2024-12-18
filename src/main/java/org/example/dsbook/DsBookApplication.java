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
            List<BookDto> books = List.of(
                    BookDto.builder().titre("Titre 1").publisher("Editeur 1").datePublication("2018-05-01").price(500).resume("Résumé 1").build(),
                    BookDto.builder().titre("Titre 2").publisher("Editeur 2").datePublication("2022-12-15").price(100).resume("Résumé 2").build(),
                    BookDto.builder().titre("Titre 3").publisher("Editeur 3").datePublication("2023-05-20").price(150).resume("Résumé 3").build(),
                    BookDto.builder().titre("Titre 4").publisher("Editeur 4").datePublication("2021-11-10").price(300).resume("Résumé 4").build()
            );
            for (BookDto bookDto : books) {
                bookService.saveBook(bookDto);
            }
        };
    }
}
