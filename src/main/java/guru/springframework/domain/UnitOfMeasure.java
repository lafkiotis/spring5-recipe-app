package guru.springframework.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dimitrios Stefos on 4/21/2018.
 */
@Entity
@Getter @Setter @NoArgsConstructor
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitOfMeasure unitOfMeasure = (UnitOfMeasure) o;
        return id.equals(unitOfMeasure.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
