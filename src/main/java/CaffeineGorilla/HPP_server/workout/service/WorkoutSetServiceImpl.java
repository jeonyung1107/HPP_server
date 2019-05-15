package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.WorkoutSetDao;
import CaffeineGorilla.HPP_server.model.WorkoutSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutSetServiceImpl implements WorkoutSetService{

    @Autowired
    WorkoutSetDao workoutSetDao;

    @Override
    public void writeWorkoutSet(WorkoutSet workoutSet) {
        workoutSetDao.insertWorkoutSet(workoutSet);
    }

    @Override
    public WorkoutSet getWorkoutSet(String id) {
        return workoutSetDao.getWorkoutSet(id);
    }

    @Override
    public void modifyWorkoutSet(WorkoutSet workoutSet) {

    }

    @Override
    public void deleteWorkoutSet(WorkoutSet workoutSet) {

    }
}
