package CaffeineGorilla.HPP_server.workout.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("muscle")
@Getter
@Setter
public class Muscle {
    private String id;
    private String Name;
    private String parent;
}
