package CaffeineGorilla.HPP_server.workout.mapper;

import CaffeineGorilla.HPP_server.workout.model.UserSession;
import CaffeineGorilla.HPP_server.workout.model.pk.UserSessionPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSessionRepository extends JpaRepository<UserSession, UserSessionPk> {
}
