package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.admin.WorkoutDao;
import CaffeineGorilla.HPP_server.workout.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    WorkoutDao workoutDao;

    public void insert(Workout workout) {
        workoutDao.insert(workout);
    }

    public void delete(Workout workout) {
        workoutDao.delete(workout);
    }

    public Workout get(Workout workout) {
        return workoutDao.get(workout);
    }
}
