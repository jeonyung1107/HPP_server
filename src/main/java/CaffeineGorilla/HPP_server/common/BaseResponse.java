package CaffeineGorilla.HPP_server.common;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class BaseResponse {
    private String message;
    private HttpStatus status;
}
