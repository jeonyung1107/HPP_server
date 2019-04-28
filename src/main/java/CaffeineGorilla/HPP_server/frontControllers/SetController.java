package CaffeineGorilla.HPP_server.frontControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/set")
public class SetController {

    @RequestMapping(method = RequestMethod.GET)
    public String getSetPage(){
        return "workoutSet";
    }
}
