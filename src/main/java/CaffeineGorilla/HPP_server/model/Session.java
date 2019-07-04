package CaffeineGorilla.HPP_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("session")
@Getter
@Setter
public class Session {
    private String id;
    private String start;
    private String end;
}
