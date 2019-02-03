package CaffeineGorilla.HPP_server.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BcrytEncoder implements PasswordEncoder {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public String encryt(String password) {
        return bCryptPasswordEncoder.encode(password);
    }
}
