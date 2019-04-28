package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.Service.UserDetailService;
import CaffeineGorilla.HPP_server.model.Session;
import CaffeineGorilla.HPP_server.model.UserDetail;
import CaffeineGorilla.HPP_server.model.UserSession;
import CaffeineGorilla.HPP_server.model.WorkoutSet;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/set")
public class WorkoutSetController {

    @Autowired
    WorkoutSetService workoutSetService;

    @Autowired
    SessionService sessionService;

    @Autowired
    UserSessionService userSessionService;

    @RequestMapping(method = RequestMethod.POST)
    public WorkoutSet writeWorkoutSet(WorkoutSet workoutSet){
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Session session = sessionService.getSession("");

        UserSession userSession = new UserSession();
        userSession.setUser(userName);
        userSession.setSession(session.getId());

        userSessionService.insertUserSession(userSession);

        workoutSet.setSession(session.getId());
        workoutSet.setId("test" + RandomStringUtils.randomAlphanumeric(6));

        workoutSetService.writeWorkoutSet(workoutSet);

        return workoutSet;
    }
}
