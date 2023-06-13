package com.isi.hexa.api.config;

import com.isi.hexa.api.security.JwtAuthenticationFilter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {


    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;




    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(c->c.disable())
                .authorizeHttpRequests((auth)->auth
                        .requestMatchers("/api/v1/**","/api/v1/auth/**","/swagger-ui/**").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(formLogin-> formLogin
                        .disable()
                )
//                .authorizeHttpRequests().requestMatchers("/api/v1/auth/**")
                .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
               // .userDetailsService(userDetailService)
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                ;

        System.out.println("security conf + " +http);

        return http.build();

    }






    //private final UserDetailServiceImpl userDetailService;





}
