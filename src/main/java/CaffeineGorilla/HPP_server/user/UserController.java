package CaffeineGorilla.HPP_server.user;

import CaffeineGorilla.HPP_server.user.UserService;
import CaffeineGorilla.HPP_server.user.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String userPage(){
        return "user";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(UserDetail userDetail){

        userDetail.setAuthority("ROLE_USER");
        userDetail.setEnabled(true);

        userService.insertUser(userDetail);

        return "add success";
    }

    @RequestMapping
    @ResponseBody
    public String deleteUser(UserDetail userDetail){
        userService.deleteUser(userDetail);

        return "delete succes";
    }
}