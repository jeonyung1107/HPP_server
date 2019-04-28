package CaffeineGorilla.HPP_server.DAO;

import CaffeineGorilla.HPP_server.model.Session;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SessionDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public void insertSession(Session session){
        sqlSessionTemplate.insert("session.insert", session);
    }

    public Session getSession(String id){
        return sqlSessionTemplate.selectOne("session.get", id);
    }

    public void deleteSession(String id){
        sqlSessionTemplate.delete("session.delete", id);
    }
}
