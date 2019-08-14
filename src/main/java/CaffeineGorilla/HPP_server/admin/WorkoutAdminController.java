package CaffeineGorilla.HPP_server.admin;

import CaffeineGorilla.HPP_server.workout.service.WorkoutService;
import CaffeineGorilla.HPP_server.workout.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/workout")
public class WorkoutAdminController {

    @Autowired
    WorkoutService workoutService;

    @PostMapping
    public void insert(Workout workout){
        workoutService.insert(workout);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id){
        workoutService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Workout get(@PathVariable String id){
        return workoutService.get(id).get();
    }
}
