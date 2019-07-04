package CaffeineGorilla.HPP_server.DAO;

import CaffeineGorilla.HPP_server.model.UserDetail;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public UserDetail getUserById(String id){
        return sqlSessionTemplate.selectOne("user.get", id);
    }

    public void insertUser(UserDetail userDetail){
        sqlSessionTemplate.insert("user.insert", userDetail);
    }

    public void deleteUser(UserDetail userDetail){
        sqlSessionTemplate.delete("user.delete", userDetail);
    }
}
