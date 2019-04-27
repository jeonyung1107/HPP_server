package CaffeineGorilla.HPP_server.model;

import org.apache.ibatis.type.Alias;

@Alias("usersession")
public class UserSession {
    private String user;
    private String session;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
