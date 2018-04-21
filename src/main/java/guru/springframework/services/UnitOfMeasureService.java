package guru.springframework.services;

import guru.springframework.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
public interface UnitOfMeasureService {

    Optional<UnitOfMeasure> findByDescription(String description);
}
