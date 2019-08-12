package CaffeineGorilla.HPP_server.workout.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Alias("workout")
@Getter
@Setter
@Entity
public class Workout {
    @Id
    private String id;
    @Column
    private String name;
    private String muscle;
    private String unit;
    private String musclePart;
}
