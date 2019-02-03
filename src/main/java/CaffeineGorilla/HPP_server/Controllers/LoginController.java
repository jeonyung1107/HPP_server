package CaffeineGorilla.HPP_server.Controllers;

import CaffeineGorilla.HPP_server.Service.UserService;
import CaffeineGorilla.HPP_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, User requestedUser){
        if(null == requestedUser.getEmail() || null == requestedUser.getPassword()){
            return "email 혹은 password가 필요합니다.";
        }

        User user = userService.get(requestedUser);

        if(null == user){
            return "해당 사용자를 찾지 못했습니다.";
        }

        if(bCryptPasswordEncoder.matches(requestedUser.getPassword(), user.getPassword())){
            Cookie token = new Cookie("token", "testToken");
            token.setMaxAge(60*60*24);
            response.addCookie(token);

            return requestedUser.getEmail() + " login success";
        }else{
            return "password가 틀립니다.";
        }
    }
}
