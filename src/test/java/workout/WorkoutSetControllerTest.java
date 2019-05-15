package workout;

import CaffeineGorilla.HPP_server.Configs.RootConfig;
import CaffeineGorilla.HPP_server.Configs.SecurityConfig;
import CaffeineGorilla.HPP_server.Configs.WebConfig;
import CaffeineGorilla.HPP_server.model.WorkoutSet;
import CaffeineGorilla.HPP_server.workout.WorkoutSetDao;
import CaffeineGorilla.HPP_server.workout.service.WorkoutSetService;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@ExtendWith(MockitoExtension.class)
public class WorkoutSetControllerTest {

    @InjectMocks
    WorkoutSetServiceImpl workoutSetService;

    @Mock
    WorkoutSetDao workoutSetDao;

    @BeforeAll
    static void initAll(){
    }


    @Test
    @DisplayName("work")
    void writeWorkoutSetTest(){
        WorkoutSet expected = new WorkoutSet();
        expected.setExcercise("testtest01");

        Mockito.when(workoutSetDao.getWorkoutSet("test2r9mEt")).thenReturn(expected);

        WorkoutSet workoutSet = workoutSetService.getWorkoutSet("test2r9mEt");

        Assertions.assertEquals("testtest01",workoutSet.getExcercise());
    }
}
