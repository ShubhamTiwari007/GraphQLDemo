package com.sprin.graphql.demo.GraphQL.Demo.repo;

import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
