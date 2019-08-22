package CaffeineGorilla.HPP_server.workout.mapper;

import CaffeineGorilla.HPP_server.workout.model.WorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutSetRepository extends JpaRepository<WorkoutSet, String> {
}
