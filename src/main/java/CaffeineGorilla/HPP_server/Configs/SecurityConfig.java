package CaffeineGorilla.HPP_server.Configs;

import CaffeineGorilla.HPP_server.DAO.UserDao;
import CaffeineGorilla.HPP_server.Service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password(bCryptPasswordEncoder.encode("1234")).roles("ADMIN").build());
        UserDetails userDetails = manager.loadUserByUsername("admin");
        return manager;
    }

    @Bean
    public UserDetailsService jdbcUserDetailService(){
        UserDetailsService userDetailsService = new UserDetailService();
        return userDetailsService;
    }

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login", "/static/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
        .and()
        .formLogin().loginPage("/login")
        .and()
        .httpBasic();
    }
}
