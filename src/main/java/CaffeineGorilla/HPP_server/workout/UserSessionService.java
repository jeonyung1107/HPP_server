package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.model.UserSession;

public interface UserSessionService {
    public void insertUserSession(UserSession userSession);
    public UserSession getCurrentUserSession();
}
