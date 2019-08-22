package workout;

import CaffeineGorilla.HPP_server.workout.mapper.WorkoutSetRepository;
import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
import CaffeineGorilla.HPP_server.workout.service.WorkoutSetServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkoutSetControllerTest {

    @InjectMocks
    WorkoutSetServiceImpl workoutSetService;

    @Mock
    WorkoutSetRepository repository;

    @BeforeAll
    static void initAll(){
    }

    private String id = "testId";
    private String excerciseName = "testtest01";

    @Test
    @DisplayName("work")
    void writeWorkoutSetTest(){
        WorkoutSet expected = new WorkoutSet();
        expected.setWorkout("testtest01");
        expected.setId("testId");

        Mockito.when(repository.findById("test2r9mEt").get()).thenReturn(expected);

        WorkoutSet workoutSet = workoutSetService.getWorkoutSet("test2r9mEt");

        Assertions.assertEquals("testtest01",workoutSet.getWorkout());
    }
}
