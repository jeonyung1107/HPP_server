package CaffeineGorilla.HPP_server.workout.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Alias("session")
@Getter
@Setter
@Entity
@Table(name = "session")
public class Session {
    @Id
    private String id;
    private String start;
    private String end;
}
