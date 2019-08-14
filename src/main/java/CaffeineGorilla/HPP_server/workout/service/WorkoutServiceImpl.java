package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.mapper.WorkoutRepository;
import CaffeineGorilla.HPP_server.workout.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    WorkoutRepository repository;

    public void insert(Workout workout) {
        repository.save(workout);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Optional<Workout> get(String id) {
        return repository.findById(id);
    }
}
