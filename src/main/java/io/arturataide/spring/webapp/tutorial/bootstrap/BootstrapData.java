package io.arturataide.spring.webapp.tutorial.bootstrap;

import io.arturataide.spring.webapp.tutorial.model.Author;
import io.arturataide.spring.webapp.tutorial.model.Book;
import io.arturataide.spring.webapp.tutorial.repositories.AuthorRepository;
import io.arturataide.spring.webapp.tutorial.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Bootstrap started");
        Author artur = new Author("Artur", "Ataide");
        Author pedro = new Author("Pedro", "Ataide");
        Book programmingBook = new Book("Programming", "12345");
        artur.getBooks().add(programmingBook);
        /*pedro.getBooks().add(programmingBook);*/
        /*programmingBook.getAuthors().add(artur);*/
        /*book1.getAuthors().add(author2);*/
        log.info("Variables Created");

        this.authorRepository.save(artur);
        this.authorRepository.save(pedro);
        this.bookRepository.save(programmingBook);

        log.info("Number of Authors {}", this.authorRepository.count());
        log.info("Number of Books {}", this.bookRepository.count());
        log.info("Bootstrap finished");
        log.info("#######################");
    }
}
