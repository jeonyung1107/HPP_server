package CaffeineGorilla.HPP_server.workout.service;


import CaffeineGorilla.HPP_server.workout.mapper.UserSessionRepository;
import CaffeineGorilla.HPP_server.workout.model.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheUserSessionService implements UserSessionService {

    @Autowired
    UserSessionRepository repository;

    UserSession userSession;

    @Override
    public void insertUserSession(UserSession userSession) {
        if(null != this.userSession){
            return;
        }

        repository.save(userSession);

        this.userSession = userSession;
    }

    @Override
    public UserSession getCurrentUserSession() {
        return userSession;
    }
}
