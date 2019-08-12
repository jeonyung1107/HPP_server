package CaffeineGorilla.HPP_server.workout.request;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class WorkoutSetRequest {
    private String id;
    private String session;
    private String excercise;
    private int intensity;
    private int numberof;
    private String writtentime;
}
