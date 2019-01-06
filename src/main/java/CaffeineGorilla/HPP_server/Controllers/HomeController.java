package CaffeineGorilla.HPP_server.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/index")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> mainHandler(){
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; ++i) list.add("test" + i);

        return list;
    }
}
