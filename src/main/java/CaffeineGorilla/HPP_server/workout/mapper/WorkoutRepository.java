package CaffeineGorilla.HPP_server.workout.mapper;

import CaffeineGorilla.HPP_server.workout.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, String > {
}
