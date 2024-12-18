package org.example.dsbook.service;

import lombok.AllArgsConstructor;
import org.example.dsbook.dao.entities.Book;
import org.example.dsbook.dao.repositories.BookRepository;
import org.example.dsbook.dto.BookDto;
import org.example.dsbook.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor


public class BookManager implements BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.fromBookToBookDto(book);
        return bookDto;
    }

    @Override
    public List<BookDto> getBookByTitre(String titre) {
        List<Book> books = bookRepository.findByTitre(titre);
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }
}
