package woolnough.jason.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
@EnableWebSecurity
public class App extends WebSecurityConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Bean
    public List<String> state() {
        return new ArrayList<>();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("RonaldWeasley")
                        .password("lurvesharry")
                        .roles("USER", "BESTIE")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
    }
}
