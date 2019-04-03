package CaffeineGorilla.HPP_server.Service;

import CaffeineGorilla.HPP_server.DAO.UserDao;
import CaffeineGorilla.HPP_server.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        UserDetail userDetail = userDao.getUserById(id);
        if(null == userDetail){
            throw new UsernameNotFoundException("user" + id + "does not exist");
        }

        return userDetail;
    }
}
