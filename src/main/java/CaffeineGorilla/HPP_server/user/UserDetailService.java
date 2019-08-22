package CaffeineGorilla.HPP_server.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public class UserDetailService implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails getUser(String id) throws UsernameNotFoundException {
        return loadUserByUsername(id);
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<UserDetail> userDetail = userDao.findById(id);

        return userDetail.orElseThrow(() -> new UsernameNotFoundException(id));
    }

    @Override
    public void insertUser(UserDetail userDetail){
        String password = userDetail.getPassword();

        String encryptedPassword = passwordEncoder.encode(password);
        userDetail.setPassword(encryptedPassword);

        userDao.save(userDetail);
    }

    @Override
    public void deleteUser(String id){
        userDao.deleteById(id);
    }
}


