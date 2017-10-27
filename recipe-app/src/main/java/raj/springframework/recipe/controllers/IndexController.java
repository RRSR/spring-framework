package raj.springframework.recipe.controllers;

import static org.springframework.http.HttpStatus.OK;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import raj.springframework.recipe.services.RecipeService;

/**
 * Created by Raj Rathore on 03-Oct-17
 */
@Controller
@RequestMapping(value = "/recipe")
@Api(value = "recipe", description = "Operations pertaining to Recipe")
public class IndexController {

  @Autowired
  private RecipeService recipeService;

  @ResponseStatus(OK)
  @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
  @ApiOperation(value = "Get the all recipes", notes = "This API retrieves the list of all the recipes.", response = String.class)
  public String getIndexPage(@ApiParam(value = "model", name = "Model") Model model) {
    model.addAttribute("recipes", recipeService.getRecipes());
    return "index";
  }
}
