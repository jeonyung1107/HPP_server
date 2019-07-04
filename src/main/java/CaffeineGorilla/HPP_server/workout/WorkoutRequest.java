package CaffeineGorilla.HPP_server.workout;

import lombok.Data;

@Data
public class WorkoutRequest {
    @Data
    public static class WorkoutSetRequest extends WorkoutRequest{
        private String id;
        private String session;
        private String excercise;
        private int intensity;
        private int numberof;
        private String writtentime;
    }
}
