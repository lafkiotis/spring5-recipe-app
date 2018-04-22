package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTestIT {

    @Autowired
    private UnitOfMeasureRepository repository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescriptionTeaspoon() throws Exception {
        Optional<UnitOfMeasure> optional = repository.findByDescription("Teaspoon");
        assertEquals("Teaspoon",  optional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception {
        Optional<UnitOfMeasure> optional = repository.findByDescription("Cup");
        assertEquals("Cup",  optional.get().getDescription());
    }
}