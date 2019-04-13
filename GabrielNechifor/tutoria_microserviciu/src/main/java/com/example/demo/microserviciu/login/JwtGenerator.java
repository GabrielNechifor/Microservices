package com.example.demo.microserviciu.login;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

    public String generate(LoginData loginData) {


        Claims claims = Jwts.claims();
        claims.put("name",loginData.getName() );


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "example")
                .compact();
    }
}
