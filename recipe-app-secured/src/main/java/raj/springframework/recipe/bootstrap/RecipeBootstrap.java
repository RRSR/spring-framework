package raj.springframework.recipe.bootstrap;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import raj.springframework.recipe.domain.Difficulty;
import raj.springframework.recipe.domain.Ingredient;
import raj.springframework.recipe.domain.Notes;
import raj.springframework.recipe.domain.Recipe;
import raj.springframework.recipe.repositories.CategoryRepository;
import raj.springframework.recipe.repositories.RecipeRepository;
import raj.springframework.recipe.repositories.UnitOfMeasureRepository;

/**
 * Created by Raj Rathore on 11-Oct-17
 */
@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent>{

  @Autowired
  private UnitOfMeasureRepository unitOfMeasureRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private RecipeRepository recipeRepository;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    initData();
  }

  private void initData(){

    Recipe recipe = new Recipe();
    recipe.setDescription("This is a very good recipe.");
    recipe.setPrepTime(10);
    recipe.setCookTime(30);
    recipe.setServings(3);
    recipe.setSource("Simply Recipes");
    recipe.setUrl("http://www.simplyrecipes.com/");
    recipe.setDirections("1 Cut avocado, remove flesh: Cut the avocados in half. Remove seed. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. Place in a bowl.\n"
        + "2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't overdo it! The guacamole should be a little chunky.)\n"
        + "3 Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. The acid in the lime juice will provide some balance to the richness of the avocado and will help delay the avocados from turning brown.\n"
        + "Add the chopped onion, cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness.\n"
        + "Remember that much of this is done to taste because of the variability in the fresh ingredients. Start with this recipe and adjust to your taste.\n"
        + "4 Cover with plastic and chill to store: Place plastic wrap on the surface of the guacamole cover it and to prevent air reaching it. (The oxygen in the air causes oxidation which will turn the guacamole brown.) Refrigerate until ready to serve.\n"
        + "Chilling tomatoes hurts their flavor, so if you want to add chopped tomato to your guacamole, add it just before serving.");
    recipe.setImage(null);
    recipe.setDifficulty(Difficulty.KIND_OF_HARD);

    recipe.addIngredients(new Ingredient("ripe avocados", new BigDecimal("2"),unitOfMeasureRepository.findByDescription("Number").get()));
    recipe.getIngredients().add(new Ingredient("fresh lime juice or lemon juice", new BigDecimal("1"),unitOfMeasureRepository.findByDescription("Tablespoon").get()));
    recipe.getIngredients().add(new Ingredient("Kosher salt", new BigDecimal("0.5"),unitOfMeasureRepository.findByDescription("Teaspoon").get()));

    recipe.getCategories().add(categoryRepository.findByDescription("American").get());
    recipe.getCategories().add(categoryRepository.findByDescription("Italian").get());

    String recipeNotes = "For a very quick guacamole just take a 1/4 cup of salsa and mix it in with your mashed avocados.\n"
        + "Feel free to experiment! One classic Mexican guacamole has pomegranate seeds and chunks of peaches in it (a Diana Kennedy favorite). Try guacamole with added pineapple, mango, or strawberries.\n"
        + "The simplest version of guacamole is just mashed avocados with salt. Don't let the lack of availability of other ingredients stop you from making guacamole.\n"
        + "To extend a limited supply of avocados, add either sour cream or cottage cheese to your guacamole dip. Purists may be horrified, but so what? It tastes great.";
    recipe.setNotes(new Notes(recipeNotes));

    recipeRepository.save(recipe);

  }
}
