package CaffeineGorilla.HPP_server.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDetail, String> {
}
