package CaffeineGorilla.HPP_server.Service;

import CaffeineGorilla.HPP_server.model.Workout;

public interface WorkoutService {
    public void insert(Workout workout);
    public void delete(Workout workout);
    public Workout get(Workout workout);
}
