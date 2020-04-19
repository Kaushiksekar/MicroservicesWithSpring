package com.tutorials.microservices.SpringServerConfigGit;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig {

    @Configuration
    @Order
    public static class GeneralWebSecurityConfig extends WebSecurityConfigurerAdapter{

        protected void configure(HttpSecurity http) throws Exception{
            http.csrf().ignoringAntMatchers("/**");
        }

    }


}
