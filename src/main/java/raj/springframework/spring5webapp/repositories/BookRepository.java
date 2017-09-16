package raj.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import raj.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
}