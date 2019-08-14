package CaffeineGorilla.HPP_server.user;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public void insertUser(UserDetail userDetail);
    public void deleteUser(UserDetail userDetail);
}
