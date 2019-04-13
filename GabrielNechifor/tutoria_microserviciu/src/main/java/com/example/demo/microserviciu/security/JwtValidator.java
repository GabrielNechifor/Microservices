package com.example.demo.microserviciu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.microserviciu.cursuri.JwtCursuri;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	@Autowired
	JwtCursuri jwtCursuri;

    private String secret = "example";

    public JwtCursuri validate(String token) {

        //JwtCursuri jwtCursuri = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

           // jwtCursuri = new JwtCursuri();

            jwtCursuri.setUsername((String) body.get("name"));
            }
        catch (Exception e) {
            System.out.println(e);
        }

        return jwtCursuri;
    }
}
