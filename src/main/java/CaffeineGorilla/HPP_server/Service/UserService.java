package CaffeineGorilla.HPP_server.Service;

import CaffeineGorilla.HPP_server.model.UserDetail;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.sql.SQLException;

public interface UserService extends UserDetailsService {
    public void insertUser(UserDetail userDetail);
    public void deleteUser(UserDetail userDetail);
}
