package com.sprin.graphql.demo.GraphQL.Demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookInput {
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
