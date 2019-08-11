package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.Session;
import CaffeineGorilla.HPP_server.workout.model.UserSession;
import CaffeineGorilla.HPP_server.workout.mapper.UserSessionDao;
import CaffeineGorilla.HPP_server.workout.WorkoutRequest;
import CaffeineGorilla.HPP_server.workout.mapper.WorkoutSetDao;
import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
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
    WorkoutSetDao workoutSetDao;

    @Autowired
    UserSessionDao userSessionDao;

    @Autowired
    SessionService sessionService;

    @Autowired
    UserSessionService userSessionService;

    @Override
    @Transactional
    public void writeWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSetRequest) throws DataAccessException {

        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Session session = sessionService.getSession(workoutSetRequest.getSession());

        UserSession userSession = new UserSession();
        userSession.setUser(userName);
        userSession.setSession(session.getId());

        userSessionService.insertUserSession(userSession);

        WorkoutSet workoutSet = new WorkoutSet();

        workoutSet.setId("test" + RandomStringUtils.randomAlphanumeric(6));
        workoutSet.setExcercise(workoutSetRequest.getExcercise());
        workoutSet.setSession(session.getId());
        workoutSet.setIntensity(workoutSetRequest.getIntensity());
        workoutSet.setNumberof(workoutSetRequest.getNumberof());

        logger.info(workoutSet.toString());

        workoutSetDao.insertWorkoutSet(workoutSet);
    }

    @Override
    public WorkoutSet getWorkoutSet(String id) {
        return workoutSetDao.getWorkoutSet(id);
    }

    @Override
    public void modifyWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSet) {

    }

    @Override
    public void deleteWorkoutSet(WorkoutRequest.WorkoutSetRequest workoutSet) {

    }
}
