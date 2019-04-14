package com.example.demo.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.security.crypto.bcrypt.BCrypt;

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
	 * hashes the password
	 */
	private boolean isPasswordStrong(UserLoginData user)
	{
        if(user.getPassword().length()>=8)
        {
		Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        
        Matcher containsLetter = letter.matcher(user.getPassword());
        Matcher containsDigit = digit.matcher(user.getPassword());
        Matcher containsSpecial= special.matcher(user.getPassword());
        
        if( containsLetter.find() && containsDigit.find() && containsSpecial.find())
        	 user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt())); 
        return true;
        }
        return false;
        
	}
	
	@Autowired
	private UserLoginDataRepository userLoginDataRepository;
	
	public String addUser(UserLoginData user) 
	{
		if(isDriverOrSender(user) && isPasswordStrong(user) && 
				!userLoginDataRepository.existsById(user.getUsername()))
		{
				userLoginDataRepository.save(user);
				return "Succes";
		}
		else return "Fail";
	}

}
