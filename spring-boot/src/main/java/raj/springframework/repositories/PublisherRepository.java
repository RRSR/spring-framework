package raj.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import raj.springframework.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
}
