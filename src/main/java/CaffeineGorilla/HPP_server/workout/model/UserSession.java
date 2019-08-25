package CaffeineGorilla.HPP_server.workout.model;

import CaffeineGorilla.HPP_server.workout.model.pk.UserSessionPk;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user_session")
public class UserSession {
    @EmbeddedId
    private UserSessionPk id;
}
