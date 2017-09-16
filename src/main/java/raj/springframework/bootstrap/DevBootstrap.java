package raj.springframework.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import raj.springframework.model.Book;
import raj.springframework.model.Publisher;
import raj.springframework.repositories.AuthorRepository;
import raj.springframework.repositories.BookRepository;
import raj.springframework.repositories.PublisherRepository;
import raj.springframework.model.Author;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        authorRepository.save(eric);
        Publisher mgh = new Publisher("Tata McGrawHill", "New York");
        publisherRepository.save(mgh);
        Book ddd = new Book("Domain Driven Design", "101", mgh);
        eric.getBooks().add(ddd);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        authorRepository.save(rod);
        Publisher pearson = new Publisher("Pearson Publication","UK");
        publisherRepository.save(pearson);
        Book noEJB = new Book("J2EE Development without EJB", "102", pearson);
        rod.getBooks().add(noEJB);
        bookRepository.save(noEJB);
    }
}
