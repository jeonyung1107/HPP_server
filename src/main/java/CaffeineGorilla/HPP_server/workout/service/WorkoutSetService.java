package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
import CaffeineGorilla.HPP_server.workout.WorkoutRequest;
import org.springframework.stereotype.Service;

@Service
public interface WorkoutSetService {
    public void writeWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSetRequest);
    public WorkoutSet getWorkoutSet(String id);
    public void modifyWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSetRequest);
    public void deleteWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSetRequest);
}
