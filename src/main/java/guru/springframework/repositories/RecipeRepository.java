package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dimitrios Stefos on 4/21/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
