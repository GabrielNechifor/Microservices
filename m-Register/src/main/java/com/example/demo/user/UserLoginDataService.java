package com.example.demo.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginDataService {

	private boolean isDriverOrSender(UserLoginData user)
	{
		return (user.getRole().toLowerCase().equals(Role.DRIVER.name().toLowerCase())
		|| user.getRole().toLowerCase().equals(Role.SENDER.name().toLowerCase()));
	}
	
	/**
	 * checks if password is >=8 letters
	 * checks for special characters and digits
	 */
	private boolean isPasswordStrong(String password)
	{
        if(password.length()>=8)
        {
		Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        
        Matcher containsLetter = letter.matcher(password);
        Matcher containsDigit = digit.matcher(password);
        Matcher containsSpecial= special.matcher(password);
        
        return containsLetter.find() && containsDigit.find() && containsSpecial.find();
        }
        return false;
        
	}
	
	@Autowired
	private UserLoginDataRepository userLoginDataRepository;
	
	public void addUser(UserLoginData user) 
	{
		if(isDriverOrSender(user) && isPasswordStrong(user.getPassword()) && 
				!userLoginDataRepository.existsById(user.getUsername()))
				userLoginDataRepository.save(user);
	}

}
