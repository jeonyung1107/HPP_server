package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.Workout;

public interface WorkoutService {
    public void insert(Workout workout);
    public void delete(Workout workout);
    public Workout get(Workout workout);
}
