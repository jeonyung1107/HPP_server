package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.common.BaseResponse;
import CaffeineGorilla.HPP_server.common.Constants;
import CaffeineGorilla.HPP_server.workout.request.WorkoutRequest;
import CaffeineGorilla.HPP_server.workout.request.WorkoutSetRequest;
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
    public BaseResponse writeWorkoutSet(WorkoutSetRequest workoutSetRequest){

        logger.info(workoutSetRequest.toString());
        workoutSetService.writeWorkoutSet(workoutSetRequest);

        BaseResponse baseResponse = BaseResponse.builder().message(Constants.RESPONSE_SUCCESS).build();

        logger.info(baseResponse.getMessage());
        return baseResponse;
    }
}
