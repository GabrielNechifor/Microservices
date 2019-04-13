package com.microserviciu.login.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
	JwtGenerator jwtGenerator;

	public UsersService(JwtGenerator jwtGenerator) {
		this.jwtGenerator=jwtGenerator;
	}
	public List<Users> getUsers() {
		return usersRepository.findAll();
	}
	
	

	public String setUsersObj(Users users) {
		users.setRole("sender");
		this.usersRepository.save(users);
		
		return jwtGenerator.generate(users);
	}
	
	
	
}
