package raj.springframework.recipe.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import raj.springframework.recipe.domain.UnitOfMeasure;

/**
 * Created by Raj Rathore on 09-Oct-17
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

  Optional<UnitOfMeasure> findByDescription(String description);
}
