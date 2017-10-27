package raj.springframework.recipe.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import raj.springframework.recipe.domain.Category;

/**
 * Created by Raj Rathore on 09-Oct-17
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

  Optional<Category> findByDescription(String description);

}
