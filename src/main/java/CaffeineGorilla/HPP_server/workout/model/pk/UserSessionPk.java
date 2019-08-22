package CaffeineGorilla.HPP_server.workout.model.pk;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSessionPk implements Serializable {
    private String user;
    private String session;
}
