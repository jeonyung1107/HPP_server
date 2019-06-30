package CaffeineGorilla.HPP_server.mapper;

import CaffeineGorilla.HPP_server.stat.vo.DayIntensity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DayStatMapper {
    List<DayIntensity> getDayIntensity(String userId);
}
