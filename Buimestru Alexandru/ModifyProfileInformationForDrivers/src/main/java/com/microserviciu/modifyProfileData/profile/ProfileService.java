package com.microserviciu.modifyProfileData.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepo; 
	
	public List<ProfileForm> getProfiles1() {
		return profileRepo.findAll();
	}

	public Optional<ProfileForm> getProfile(String username) {
		
		return profileRepo.findById(username);
	}

	public void changeProfileDataObj(String username, ChangedProfileForm changedProfile) {

		if(profileRepo.existsById(username)) {
			ProfileForm profile = new ProfileForm(username,changedProfile);
			profileRepo.save(profile);
		}
		else
		{}
	}
	
	
}
