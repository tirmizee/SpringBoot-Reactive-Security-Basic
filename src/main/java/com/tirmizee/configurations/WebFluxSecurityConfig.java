package com.tirmizee.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class WebFluxSecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
         http
             .authorizeExchange()
                .pathMatchers("/resources/**").permitAll()
                .anyExchange().authenticated()
                .and()
            .httpBasic().and()
            .formLogin()
//                 .loginPage("")
                 .and();
        return http.build();
    }

}
