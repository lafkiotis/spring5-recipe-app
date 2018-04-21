package guru.springframework.services;

import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
@Service
public class UnitOfMeasureServiceImpl  implements UnitOfMeasureService {

    private final UnitOfMeasureRepository repository;

    @Autowired
    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<UnitOfMeasure> findByDescription(String description) {
        return repository.findByDescription(description);
    }
}
