package org.example.dsbook.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_Book;
    String titre;
    String publisher;
    String datePublication;
    double price;
    String resume;
}
