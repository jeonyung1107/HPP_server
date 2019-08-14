package CaffeineGorilla.HPP_server.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailService implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        UserDetail userDetail = userDao.getUserById(id);
        if(null == userDetail){
            throw new UsernameNotFoundException("user" + id + "does not exist");
        }

        return userDetail;
    }

    @Override
    public void insertUser(UserDetail userDetail){
        String password = userDetail.getPassword();

        String encryptedPassword = passwordEncoder.encode(password);
        userDetail.setPassword(encryptedPassword);

        userDao.insertUser(userDetail);
    }

    @Override
    public void deleteUser(UserDetail userDetail){
        userDao.deleteUser(userDetail);
    }
}


