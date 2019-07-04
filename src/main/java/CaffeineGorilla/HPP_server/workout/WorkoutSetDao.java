package CaffeineGorilla.HPP_server.workout;

import CaffeineGorilla.HPP_server.model.WorkoutSet;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorkoutSetDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public WorkoutSet getWorkoutSet(String id){
        return sqlSessionTemplate.selectOne("workoutSet.get", id);
    }

    public void insertWorkoutSet(WorkoutSet workoutSet){
        sqlSessionTemplate.insert("workoutSet.insert", workoutSet);
    }

    public void deleteWorkoutSet(String id){
        sqlSessionTemplate.delete("workoutSet.delete", id);
    }
}
