package guru.springframework.services;

import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
@Service
public class CategoryServiceImpl  implements CategoryService {

    private final CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository){
        this.repository = repository;
    }

    @Override
    public Optional<Category> findByDescription(String description) {
        return repository.findByDescription(description);
    }
}
