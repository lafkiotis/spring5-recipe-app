package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by Dimitrios Stefos on 4/21/18.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
