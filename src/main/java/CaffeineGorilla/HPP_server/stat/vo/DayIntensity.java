package CaffeineGorilla.HPP_server.stat.vo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DayIntensity {
    Integer intensity;
    Date day;
}
