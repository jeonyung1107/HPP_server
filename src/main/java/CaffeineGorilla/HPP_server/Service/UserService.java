package CaffeineGorilla.HPP_server.Service;

import CaffeineGorilla.HPP_server.DAO.UserDao;
import CaffeineGorilla.HPP_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    public void insert(User user);
    public void delete(User user);
    public User get(User user);
}
