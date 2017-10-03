package raj.springframework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Raj Rathore on 03-Oct-17
 */
@Controller
public class IndexController {


  @RequestMapping({"","/","/index"})
  public String getIndexPage(){
    return "index";
  }
}
