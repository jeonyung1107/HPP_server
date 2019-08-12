package CaffeineGorilla.HPP_server.workout.request;

import lombok.Data;

@Data
public class WorkoutRequest {
    private String id;
    private String name;
    private String muscle;
    private String unit;
    private String musclePart;
}
