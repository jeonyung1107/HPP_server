package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.common.BaseResponse;
import CaffeineGorilla.HPP_server.workout.model.Workout;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkoutResponse extends BaseResponse {
    Workout workout;

    @Builder
    public WorkoutResponse(Object message, HttpStatus status, Workout workout) {
        super(message, status);
        this.workout = workout;
    }
}
