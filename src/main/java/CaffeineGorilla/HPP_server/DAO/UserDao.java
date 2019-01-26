package CaffeineGorilla.HPP_server.DAO;

import CaffeineGorilla.HPP_server.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public void insertUser(User user){
        sqlSessionTemplate.insert("user.insert", user);
    }

    public void deleteUser(User user){
        sqlSessionTemplate.delete("user.delete", user);
    }

    public User getUser(User user){
        return sqlSessionTemplate.selectOne("user.get", user);
    }
}
