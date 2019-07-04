package CaffeineGorilla.HPP_server.admin;

import CaffeineGorilla.HPP_server.Service.WorkoutService;
import CaffeineGorilla.HPP_server.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/workout")
public class WorkoutAdminController {

    @Autowired
    WorkoutService workoutService;

    @RequestMapping(method = RequestMethod.POST)
    public void insert(Workout workout){
        workoutService.insert(workout);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        Workout deleteTarget = new Workout();
        deleteTarget.setId(id);
        workoutService.delete(deleteTarget);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Workout get(@PathVariable String id){
        Workout request = new Workout();
        request.setId(id);

        return workoutService.get(request);
    }
}
