package CaffeineGorilla.HPP_server.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails getUser(String id);
    public void insertUser(UserDetail userDetail);
    public void deleteUser(String id);
}
