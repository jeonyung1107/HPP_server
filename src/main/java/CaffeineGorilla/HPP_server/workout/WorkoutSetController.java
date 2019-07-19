package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.workout.service.SessionService;
import CaffeineGorilla.HPP_server.workout.service.UserSessionService;
import CaffeineGorilla.HPP_server.workout.service.WorkoutSetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/set")
public class WorkoutSetController {

    private static Logger logger = LoggerFactory.getLogger(WorkoutSetController.class);

    @Autowired
    WorkoutSetService workoutSetService;

    @Autowired
    SessionService sessionService;

    @Autowired
    UserSessionService userSessionService;

    @RequestMapping(method = RequestMethod.POST)
    public WorkoutRequest.WorkoutSetRequest writeWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSetRequest){

        workoutSetService.writeWorkoutSet(workoutSetRequest);

        return workoutSetRequest;
    }
}
