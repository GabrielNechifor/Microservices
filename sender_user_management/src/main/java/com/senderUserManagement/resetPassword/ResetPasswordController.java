package com.senderUserManagement.resetPassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senderUserManagement.model.ResetPassword;


@RestController
public class ResetPasswordController {

	@Autowired
	ResetPasswordServices resetPasswordService;
	
	 @RequestMapping(method=RequestMethod.PUT,value="senderUserManagement/resetPassword")
	 public String setNewPassword(@RequestBody ResetPassword users) {
		 return resetPasswordService.setNewPassword(users);
	 }
}
