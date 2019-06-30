package CaffeineGorilla.HPP_server.stat;

import CaffeineGorilla.HPP_server.stat.vo.DayIntensity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/stat")
public class StatController {

    @Autowired
    StatService statService;

    @GetMapping(value = "/day")
    public List<DayIntensity> getDayIntensityByUserId(@RequestBody String userId){
        return statService.getDayIntensityByUserId(userId);
    }
}
