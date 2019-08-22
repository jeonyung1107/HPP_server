package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.Configs.RootConfig;
import CaffeineGorilla.HPP_server.workout.mapper.UserSessionRepository;
import CaffeineGorilla.HPP_server.workout.mapper.WorkoutSetRepository;
import CaffeineGorilla.HPP_server.workout.model.Session;
import CaffeineGorilla.HPP_server.workout.model.UserSession;
import CaffeineGorilla.HPP_server.workout.model.pk.UserSessionPk;
import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
import CaffeineGorilla.HPP_server.workout.request.WorkoutSetRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkoutSetServiceImpl implements WorkoutSetService{

    private static Logger logger = LoggerFactory.getLogger(WorkoutServiceImpl.class);

    @Autowired
    WorkoutSetRepository workoutSetRepositorysitory;

    @Autowired
    SessionService sessionService;

    @Autowired
    UserSessionService userSessionService;

    @Override
    @Transactional(transactionManager = RootConfig.JPA_TRANSACTION_MANAGER)
    public void writeWorkoutSet(WorkoutSetRequest workoutSetRequest) throws DataAccessException {

        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Session session = sessionService.getSession(workoutSetRequest.getSession());

        UserSession userSession = new UserSession();
        userSession.setId(UserSessionPk.builder().user(userName).session(session.getId()).build());

        userSessionService.insertUserSession(userSession);

        WorkoutSet workoutSet = new WorkoutSet();

        workoutSet.setId(RandomStringUtils.randomAlphanumeric(10));
        workoutSet.setWorkout(workoutSetRequest.getExcercise());
        workoutSet.setSession(session.getId());
        workoutSet.setIntensity(workoutSetRequest.getIntensity());
        workoutSet.setNumberof(workoutSetRequest.getNumberof());

        logger.info(workoutSet.toString());

        workoutSetRepositorysitory.save(workoutSet);
    }

    @Override
    public WorkoutSet getWorkoutSet(String id) {
        return workoutSetRepositorysitory.findById(id).get();
    }

    @Override
    public void modifyWorkoutSet(WorkoutSetRequest workoutSet) {

    }

    @Override
    public void deleteWorkoutSet(WorkoutSetRequest workoutSet) {

    }
}
