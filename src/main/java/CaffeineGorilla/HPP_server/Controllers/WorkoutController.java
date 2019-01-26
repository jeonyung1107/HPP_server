package CaffeineGorilla.HPP_server.Controllers;

import CaffeineGorilla.HPP_server.Service.WorkoutService;
import CaffeineGorilla.HPP_server.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(Workout workout){
        workoutService.insert(workout);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Workout workout){
        workoutService.delete(workout);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Workout get(@PathVariable String id){
        Workout request = new Workout();
        request.setId(id);

        return workoutService.get(request);
    }
}
