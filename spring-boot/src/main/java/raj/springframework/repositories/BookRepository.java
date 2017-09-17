package raj.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import raj.springframework.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
}
