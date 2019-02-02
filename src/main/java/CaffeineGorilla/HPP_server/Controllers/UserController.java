package CaffeineGorilla.HPP_server.Controllers;

import CaffeineGorilla.HPP_server.Service.UserService;
import CaffeineGorilla.HPP_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
//    TODO 검증자 인터페이스 추가할 것

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(User user){
        userService.insert(user);
        //TODO 암호화 로직 넣어줄 것
        return user.getId() + "inserted";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(User user){
        userService.delete(user);

        return user.getId() + "deleted";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id){
        User request = new User();
        request.setId(id);
        User user = userService.get(request);

        return user;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public
}
