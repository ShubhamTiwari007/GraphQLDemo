package com.sprin.graphql.demo.GraphQL.Demo.service;

import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;
import com.sprin.graphql.demo.GraphQL.Demo.entity.BookInput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBookEntity(BookInput bookInput);
}
