package guru.springframework.controllers;

import guru.springframework.services.CategoryService;
import guru.springframework.services.RecipeService;
import guru.springframework.services.UnitOfMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
@Controller
public class IndexController {

    private final CategoryService categoryService;
    private final UnitOfMeasureService unitOfMeasureService;
    private final RecipeService recipeService;

    @Autowired
    public IndexController(CategoryService categoryService, UnitOfMeasureService unitOfMeasureService, RecipeService recipeService) {
        this.categoryService = categoryService;
        this.unitOfMeasureService = unitOfMeasureService;
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(ModelMap modelMap) {
        modelMap.addAttribute("recipes", recipeService.findAll());
        return "index";
    }
}
