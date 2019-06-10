package CaffeineGorilla.HPP_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("workout")
@Getter
@Setter
public class Workout {
    private String id;
    private String name;
    private String muscle;
    private String unit;
    private String musclePart;
}
