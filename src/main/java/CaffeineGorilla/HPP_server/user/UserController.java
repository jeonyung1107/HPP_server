package CaffeineGorilla.HPP_server.user;

import CaffeineGorilla.HPP_server.common.BaseResponse;
import CaffeineGorilla.HPP_server.common.Constants;
import CaffeineGorilla.HPP_server.user.UserService;
import CaffeineGorilla.HPP_server.user.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    public BaseResponse userPage(@PathVariable String id){
        UserDetails userDetails = userService.getUser(id);

        BaseResponse response = UserResponse.builder()
                .message(Constants.RESPONSE_SUCCESS).status(HttpStatus.OK).userDetails(userDetails).build();

        return response;
    }

    @PostMapping(value = "/add")
    public String addUser(UserDetail userDetail){

        userDetail.setAuthority("ROLE_USER");
        userDetail.setEnabled(true);

        userService.insertUser(userDetail);

        return "add success";
    }

    @DeleteMapping("/{id}")
    public BaseResponse deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        BaseResponse response = UserResponse.builder().message(Constants.RESPONSE_SUCCESS)
                .status(HttpStatus.OK).build();

        return response;
    }
}
