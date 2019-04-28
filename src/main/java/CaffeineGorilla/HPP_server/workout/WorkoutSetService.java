package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.model.WorkoutSet;
import org.springframework.stereotype.Service;

@Service
public interface WorkoutSetService {
    public void writeWorkoutSet(WorkoutSet workoutSet);
    public WorkoutSet getWorkoutSet(String id);
    public void modifyWorkoutSet(WorkoutSet workoutSet);
    public void deleteWorkoutSet(WorkoutSet workoutSet);
}
