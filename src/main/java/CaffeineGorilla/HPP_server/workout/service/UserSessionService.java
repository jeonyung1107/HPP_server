package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.model.UserSession;

public interface UserSessionService {
    public void insertUserSession(UserSession userSession);
    public UserSession getCurrentUserSession();
}
