package CaffeineGorilla.HPP_server.workout.service;

import CaffeineGorilla.HPP_server.workout.SessionDao;
import CaffeineGorilla.HPP_server.workout.model.Session;
import com.sun.istack.internal.Nullable;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SpringSessionSessionService implements SessionService{

    @Autowired
    SessionDao sessionDao;

    Session session;

    @Override
    public Session getSession(@Nullable String id) {
        if(null == session){
            session = new Session();
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            session.setId(simpleDateFormat.format(date).toString() + "test" + RandomStringUtils.randomAlphanumeric(4));

            sessionDao.insertSession(session);
        }

        return session;
    }

    @Override
    public void finishSession() {

    }

    @Override
    public void modifySession(String id) {

    }

    @Override
    public void deleteSession(String id) {

    }
}
