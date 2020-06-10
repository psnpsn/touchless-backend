/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessusers;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 *
 * @author psn
 */
@EnableWebFluxSecurity
public class ResourceServerConfig {
    
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
         http
          .csrf().disable()
          .authorizeExchange()
          .pathMatchers("/user/**").hasAuthority("ROLE_admin")
          .anyExchange().authenticated()
          .and().oauth2ResourceServer()
          .jwt();
         return http.build();
    }
    
    
    
}
