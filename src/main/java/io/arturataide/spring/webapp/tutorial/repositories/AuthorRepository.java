package io.arturataide.spring.webapp.tutorial.repositories;

import io.arturataide.spring.webapp.tutorial.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
