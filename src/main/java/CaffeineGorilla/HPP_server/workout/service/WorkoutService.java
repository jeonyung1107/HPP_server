package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.Workout;

import java.util.Optional;

public interface WorkoutService {
    public void insert(Workout workout);
    public void delete(String id);
    public Optional<Workout> get(String id);
}
