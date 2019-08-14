package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.common.BaseResponse;
import CaffeineGorilla.HPP_server.common.Constants;
import CaffeineGorilla.HPP_server.workout.model.Workout;
import CaffeineGorilla.HPP_server.workout.request.WorkoutRequest;
import CaffeineGorilla.HPP_server.workout.service.WorkoutService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout")
public class WorkoutController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    WorkoutService workoutService;

    ModelMapper modelMapper = new ModelMapper();

    @PostMapping("/add")
    public BaseResponse addWorkout(@RequestBody(required = true) WorkoutRequest request){
        logger.info(request.toString());
        workoutService.insert(modelMapper.map(request, Workout.class));
        BaseResponse response = BaseResponse.builder().message(Constants.RESPONSE_SUCCESS).build();
        logger.info(response.toString());

        return response;
    }

    @GetMapping("/{id}")
    public Workout getWorkout(@PathVariable String id){
        logger.info(id);
        Workout result = workoutService.get(id).get();

        return result;
    }
}
