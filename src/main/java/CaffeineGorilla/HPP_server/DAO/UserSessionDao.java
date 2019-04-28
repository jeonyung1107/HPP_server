package CaffeineGorilla.HPP_server.DAO;

import CaffeineGorilla.HPP_server.model.UserSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserSessionDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public void insertUserSession(UserSession userSession){
        sqlSessionTemplate.insert("usersession.insert", userSession);
    }

}