package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.model.Session;
import com.sun.istack.internal.Nullable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {
    public Session getSession(@Nullable String id);
    public void finishSession();
    public void modifySession(String id);
    public void deleteSession(String id);
}
