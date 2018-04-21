package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Dimitrios Stefos on 4/21/2018.
 */
@Entity
@Getter @Setter
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
