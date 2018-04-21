package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.List;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
public interface RecipeService {

    List<Recipe>  findAll();

    void saveAll(List<Recipe>  recipes);

    Recipe findById(Long aLong);
}
