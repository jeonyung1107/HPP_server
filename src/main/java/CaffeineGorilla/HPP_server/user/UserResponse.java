package CaffeineGorilla.HPP_server.user;

import CaffeineGorilla.HPP_server.common.BaseResponse;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;

@Data
public class UserResponse extends BaseResponse {
    private UserDetails userDetails;

    @Builder
    public UserResponse(Object message, HttpStatus status, UserDetails userDetails) {
        super(message, status);
        this.userDetails = userDetails;
    }

}
