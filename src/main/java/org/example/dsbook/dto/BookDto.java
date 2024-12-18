package org.example.dsbook.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class BookDto {
    String titre;
    String publisher;
    String datePublication;
    double price;
    String resume;
}
