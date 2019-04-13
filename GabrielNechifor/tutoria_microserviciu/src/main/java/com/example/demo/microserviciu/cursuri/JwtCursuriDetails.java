package com.example.demo.microserviciu.cursuri;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtCursuriDetails implements UserDetails {
	

	private String username;
	private String token;
	
	public JwtCursuriDetails() {}
	public JwtCursuriDetails(String username, String token) {
		super();
		this.username = username;
		this.token = token;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public String getPassword() {
		return null;
	}
    @Override
    public String getUsername() {
        return username;
    }
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}


	public String getToken() {
		return token;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setToken(String token) {
		this.token = token;
	}
	

}
