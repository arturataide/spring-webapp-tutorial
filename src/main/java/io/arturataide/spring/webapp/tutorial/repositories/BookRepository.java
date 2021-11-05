package io.arturataide.spring.webapp.tutorial.repositories;

import io.arturataide.spring.webapp.tutorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface  BookRepository extends CrudRepository<Book, Long> {
}
