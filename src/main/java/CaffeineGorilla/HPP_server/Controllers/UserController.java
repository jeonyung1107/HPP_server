package CaffeineGorilla.HPP_server.Controllers;

import CaffeineGorilla.HPP_server.Service.UserService;
import CaffeineGorilla.HPP_server.model.User;
import CaffeineGorilla.HPP_server.utils.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
//    TODO 검증자 인터페이스 추가할 것
    @Autowired
    PasswordEncoder passwordEncrytor;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(User user){

        if(null == user.getEmail() || null == user.getPassword()){
            return "email 혹은 password가 필요합니다.";
        }
        user.setPassword(passwordEncrytor.encryt(user.getPassword()));

        try {
            userService.insert(user);
        }catch (DuplicateKeyException e){
            return "email already exists";
        }catch (Exception e){
            return e.getMessage();
        }
        //TODO 암호화 로직 넣어줄 것
        return user.getId() + "inserted";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(User user){
        try {
            userService.delete(user);
        }catch (Exception e){
            return e.getMessage();
        }

        return user.getId() + "deleted";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id){
        User request = new User();
        request.setId(id);
        Optional<User> user = Optional.ofNullable(userService.get(request));

        return user.orElse(new User());
    }
}
