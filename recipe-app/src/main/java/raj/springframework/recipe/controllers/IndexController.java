package raj.springframework.recipe.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import raj.springframework.recipe.domain.Category;
import raj.springframework.recipe.domain.UnitOfMeasure;
import raj.springframework.recipe.repositories.CategoryRepository;
import raj.springframework.recipe.repositories.UnitOfMeasureRepository;

/**
 * Created by Raj Rathore on 03-Oct-17
 */
@Controller
public class IndexController {

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private UnitOfMeasureRepository unitOfMeasureRepository;

  @RequestMapping({"","/","/index"})
  public String getIndexPage(){
    Optional<Category> category = categoryRepository.findByDescription("Mexican");
    Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Pinch");

    System.out.println("The category ID : "+category.get().getId());
    System.out.println("The unit of measure ID : "+unitOfMeasure.get().getId());

    return "index";
  }
}
