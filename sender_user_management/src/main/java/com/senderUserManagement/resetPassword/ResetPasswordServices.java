package com.senderUserManagement.resetPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.senderUserManagement.model.JwtUser;
import com.senderUserManagement.model.ResetPassword;
import com.senderUserManagement.model.Users;
import com.senderUserManagement.repositories.*;

@Service
public class ResetPasswordServices {
	@Autowired
	public UsersRepository userRepository;
	
	public String setNewPassword(ResetPassword resetPasswordUser)
	{
		Users user = new Users();
		if (userRepository.existsById(resetPasswordUser.getUsername()) &&
				BCrypt.checkpw(resetPasswordUser.getOldPassword() , userRepository.getOne(resetPasswordUser.getUsername()) .getPassword())
				&& JwtUser.getUserName().equals(resetPasswordUser.username)
				&& JwtUser.getRole().equals("sender"))
		{
			user.setUsername(resetPasswordUser.getUsername());
			 user.setPassword(BCrypt.hashpw(resetPasswordUser.getOldPassword(), BCrypt.gensalt()));
			userRepository.save(user);
			return "Succes";
		    
			
		}
		else
			return "Fail";
	
	}

}
