package com.microserviciu.modifyProfileData.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profiles;
	
	 @RequestMapping("/senderUserManagement/modifyProfileInformation")
     public List<ProfileForm> getProfiles(){
   	 
		return profiles.getProfiles1();
   	  
     }
	 
	 @RequestMapping("/senderUserManagement/modifyProfileInformation/{username}")
	  public Optional<ProfileForm> getrofile(@PathVariable String username) {
		  
		return profiles.getProfile(username);
		  
	  }
	 
	 @RequestMapping(method=RequestMethod.PUT,value="/senderUserManagement/modifyProfileInformation/{username}")
	  public void changeProfileData(@PathVariable String username, @RequestBody ChangedProfileForm profile) {
		  profiles.changeProfileDataObj(username,profile);
	  }
}
