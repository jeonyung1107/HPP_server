package CaffeineGorilla.HPP_server.Service;

import CaffeineGorilla.HPP_server.DAO.UserDao;
import CaffeineGorilla.HPP_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public void insert(User user) {
        userDao.insertUser(user);
    }

    public User get(User user) {
        return userDao.getUser(user);
    }

    public void delete(User user) {
        userDao.deleteUser(user);
    }
}
