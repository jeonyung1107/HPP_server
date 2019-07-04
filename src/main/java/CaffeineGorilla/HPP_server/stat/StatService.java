package CaffeineGorilla.HPP_server.stat;

import CaffeineGorilla.HPP_server.mapper.DayStatMapper;
import CaffeineGorilla.HPP_server.stat.vo.DayIntensity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatService {

    @Autowired
    DayStatMapper dayStatMapper;

    public List<DayIntensity> getDayIntensityByUserId(String userId){
        return dayStatMapper.getDayIntensity(userId);
    }
}
