package com.example.demo.microserviciu.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	LoginDataRepository loginDataRepository;
	
	JwtGenerator jwtGenerator;
	
    public LoginController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

	@RequestMapping(method=RequestMethod.POST,value="/login")
	public String generate(@RequestBody final LoginData loginData){
		
		if(!loginDataRepository.existsById(loginData.getName())) return "Cursul nu exista";
		
		return jwtGenerator.generate(loginData);
		
	}
	
}
