package CaffeineGorilla.HPP_server.workout.model;

import CaffeineGorilla.HPP_server.workout.model.pk.UserSessionPk;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Alias("usersession")
@Getter
@Setter
@Entity
@Table(name = "user_session")
public class UserSession {
    @EmbeddedId
    private UserSessionPk id;
}
