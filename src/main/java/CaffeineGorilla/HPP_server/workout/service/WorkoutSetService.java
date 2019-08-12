package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
import CaffeineGorilla.HPP_server.workout.request.WorkoutSetRequest;
import org.springframework.stereotype.Service;

@Service
public interface WorkoutSetService {
    public void writeWorkoutSet(WorkoutSetRequest workoutSetRequest);
    public WorkoutSet getWorkoutSet(String id);
    public void modifyWorkoutSet(WorkoutSetRequest workoutSetRequest);
    public void deleteWorkoutSet(WorkoutSetRequest workoutSetRequest);
}
