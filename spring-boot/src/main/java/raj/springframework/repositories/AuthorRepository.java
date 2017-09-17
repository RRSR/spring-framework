package raj.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import raj.springframework.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
