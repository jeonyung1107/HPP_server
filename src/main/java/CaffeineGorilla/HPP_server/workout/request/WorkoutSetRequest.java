package CaffeineGorilla.HPP_server.workout.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSetRequest {
    private String id;
    private String session;
    private String excercise;
    private int intensity;
    private int numberof;
    private String writtentime;
}
