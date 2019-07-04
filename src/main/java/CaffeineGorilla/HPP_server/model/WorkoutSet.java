package CaffeineGorilla.HPP_server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("workoutSet")
@Getter
@Setter
@ToString
public class WorkoutSet {
    private String id;
    private String session;
    private String excercise;
    private int intensity;
    private int numberof;
    private String writtentime;
}
