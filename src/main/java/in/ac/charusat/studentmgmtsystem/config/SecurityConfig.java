package in.ac.charusat.studentmgmtsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    Go to right click and go to genrator to override methon and
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
                .and()
                .withUser("20IT022")
                .password("20IT022")
                .roles("USER");
    }
    @Bean
//    here password is ancoding so this mathod to create any method ancoding and decoding
    public PasswordEncoder getpasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
