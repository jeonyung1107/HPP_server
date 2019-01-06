package CaffeineGorilla.HPP_server.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, String> mainHandler(){
        Map<String, String> map = new HashMap<String, String>();

        for(int i=0; i<10; ++i){
            map.put(Integer.toString(i),"value" + i);
        }

        return map;
    }
}
