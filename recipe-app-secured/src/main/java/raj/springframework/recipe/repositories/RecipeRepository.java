package raj.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import raj.springframework.recipe.domain.Recipe;

/**
 * Created by Raj Rathore on 09-Oct-17
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
