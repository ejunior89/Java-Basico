package com.example.seguranca.gerenciador_de_usuarios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.seguranca.gerenciador_de_usuarios.service.UserDetailsServiceImpl;

@Configuration
public class SecurityConfig {

    private final UserDetailsServiceImpl userDetailsService;

    public SecurityConfig(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable()) // Desabilita o CSRF para o console do H2 funcionar
        .userDetailsService(userDetailsService)
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/h2-console/**").permitAll()
            .requestMatchers("/users/register").permitAll() // Permite acesso a todos para se registrar
            .requestMatchers("/swagger-ui.html", "/v3/api-docs/**", "/swagger-ui/**").permitAll()
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
        )
        .formLogin(withDefaults())
        .httpBasic(withDefaults());

    http.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.sameOrigin())); // Permite que o console do H2 seja renderizado em um frame

    return http.build();
}
}