package raj.springframework.recipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import raj.springframework.recipe.services.RecipeService;

/**
 * Created by Raj Rathore on 03-Oct-17
 */
@Controller
public class IndexController {

  @Autowired
  private RecipeService recipeService;

  @RequestMapping({"","/","/index"})
  public String getIndexPage(Model model){
    model.addAttribute("recipes",recipeService.getRecipes());
    return "index";
  }
}
