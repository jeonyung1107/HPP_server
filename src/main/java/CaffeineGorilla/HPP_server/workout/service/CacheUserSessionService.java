package CaffeineGorilla.HPP_server.workout.service;


import CaffeineGorilla.HPP_server.DAO.UserSessionDao;
import CaffeineGorilla.HPP_server.model.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheUserSessionService implements UserSessionService {

    @Autowired
    UserSessionDao userSessionDao;

    UserSession userSession;

    @Override
    public void insertUserSession(UserSession userSession) {
        if(null != this.userSession){
            return;
        }

        userSessionDao.insertUserSession(userSession);

        this.userSession = userSession;
    }

    @Override
    public UserSession getCurrentUserSession() {
        return userSession;
    }
}
