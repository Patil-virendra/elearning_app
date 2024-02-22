package com.jwt.example.jwtExample3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyConfig {


//    @Bean
//    public  UserDetailsService userDetailsService()
//    {
//        UserDetails v1 = User.builder().username("vire")
//                .password(passwordEncoder().encode("abc"))
//                .roles("ADMIN")
//                .build();
//        UserDetails v2 = User.builder().username("sachin")
//                .password(passwordEncoder().encode("7776"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(v2,v1);
//    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
