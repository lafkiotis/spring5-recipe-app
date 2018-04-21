package guru.springframework.services;

import guru.springframework.domain.Category;

import java.util.Optional;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
public interface CategoryService {

    Optional<Category> findByDescription(String description);
}
