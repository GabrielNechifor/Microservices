package com.microserviciu.getProfileInformation.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfilesController {
	@Autowired
	ProfileService profilesService;
	
	@RequestMapping("/driverUserManagement/getProfileInformation/all")
	public List<Profiles> getProfileService(){
		return profilesService.getProfiles();
	}
	
	 @RequestMapping("/driverUserManagement/getProfileInformation/{username}")
		public Optional<Profiles> getProfile(@PathVariable String username ) {
			return profilesService.getProfile(username);
		}
	

}
