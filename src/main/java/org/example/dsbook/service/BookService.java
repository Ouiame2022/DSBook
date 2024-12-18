package org.example.dsbook.service;

import org.example.dsbook.dto.BookDto;

import java.util.List;

public interface BookService {

    public BookDto saveBook(BookDto bookDto);

    public List<BookDto> getBookByTitre(String titre);


}
