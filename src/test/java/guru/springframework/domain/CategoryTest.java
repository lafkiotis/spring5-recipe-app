package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimitrios Stefos on 4/22/2018.
 */
public class CategoryTest {

    private Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {

        category.setId(new Long(4));

        assertEquals(new Long(4), category.getId());
    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void getRecipes() throws Exception {

    }

}