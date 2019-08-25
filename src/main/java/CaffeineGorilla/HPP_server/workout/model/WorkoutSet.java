package CaffeineGorilla.HPP_server.workout.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "workout_set")
public class WorkoutSet {
    @Id
    private String id;
    private String session;
    private String workout;
    private int intensity;
    private int numberof;
    private String writtentime;
}
