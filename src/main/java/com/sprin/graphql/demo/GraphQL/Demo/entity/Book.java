package com.sprin.graphql.demo.GraphQL.Demo.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "project_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
