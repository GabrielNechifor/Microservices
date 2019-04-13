package com.example.demo.microserviciu.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.example.demo.microserviciu.cursuri.JwtAuthenticationToken;
import com.example.demo.microserviciu.cursuri.JwtCursuri;
import com.example.demo.microserviciu.cursuri.JwtCursuriDetails;

@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private JwtValidator validator;
    
    @Autowired
    private JwtCursuriDetails jwtCursuriDetails;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) usernamePasswordAuthenticationToken;
        String token = jwtAuthenticationToken.getToken();

        JwtCursuri jwtCursuri = validator.validate(token);

        if (jwtCursuri == null) {
            throw new RuntimeException("JWT Token is incorrect");
        }

       jwtCursuriDetails.setUsername(jwtCursuri.getUsername());
       jwtCursuriDetails.setToken(token);
        return jwtCursuriDetails;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return (JwtAuthenticationToken.class.isAssignableFrom(aClass));
    }
}
