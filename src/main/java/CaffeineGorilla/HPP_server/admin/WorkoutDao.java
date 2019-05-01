package CaffeineGorilla.HPP_server.admin;

import CaffeineGorilla.HPP_server.model.Workout;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorkoutDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public void insert(Workout workout){
        sqlSessionTemplate.insert("workout.insert", workout);
    }

    public void delete(Workout workout){
        sqlSessionTemplate.delete("workout.delete", workout);
    }

    public Workout get(Workout workout){
        return sqlSessionTemplate.selectOne("workout.get", workout);
    }
}
