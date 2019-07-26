package CaffeineGorilla.HPP_server.workout.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("usersession")
@Getter
@Setter
public class UserSession {
    private String user;
    private String session;
}
