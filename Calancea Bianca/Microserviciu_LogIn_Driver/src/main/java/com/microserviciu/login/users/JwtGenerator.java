package com.microserviciu.login.users;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

	public String generate(Users users) {
		Claims claims = Jwts.claims();
		claims.put("username",users.getUsername());
		claims.put("role",users.getRole());
		return Jwts.builder()
				.setClaims(claims)
				.signWith(SignatureAlgorithm.HS512, "iUber")
				.compact();
	}
}
