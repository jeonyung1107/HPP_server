package CaffeineGorilla.HPP_server.workout.mapper;

import CaffeineGorilla.HPP_server.workout.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
}
