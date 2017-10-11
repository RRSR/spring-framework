package raj.springframework.recipe.services;

import java.util.Set;
import raj.springframework.recipe.domain.Recipe;

/**
 * Created by Raj Rathore on 11-Oct-17
 */
public interface RecipeService {

  Set<Recipe> getRecipes();

}
