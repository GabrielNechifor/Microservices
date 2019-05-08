package com.senderUserManagement.modifyProfileData;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senderUserManagement.model.ChangedProfiles;
import com.senderUserManagement.model.JwtUser;
import com.senderUserManagement.model.Profiles;
import com.senderUserManagement.repositories.ProfilesRepository;


@Service
public class ModifyProfileDataService {

	@Autowired
	private ProfilesRepository profileRepo; 

	
	public List<Profiles> getProfiles1() {
		return profileRepo.findAll();
	}

	public Optional<Profiles> getProfile(String username) {
		if(JwtUser.getUserName().equals(username))
		return profileRepo.findById(username);
		return null;
	}

	public String changeProfileDataObj(String username, ChangedProfiles changedProfile) {

		if(profileRepo.existsById(username) && JwtUser.getUserName().equals(username) && JwtUser.getRole().equals("sender")) {
		 Profiles profile = new Profiles(profileRepo.findById(username).get());
		 if(changedProfile.getAddress1() != null)
		 {
			 profile.setAddress1(changedProfile.getAddress1());
		 }
		 if(changedProfile.getAddress2()!= null)
		 {
			 profile.setAddress2(changedProfile.getAddress2());
		 }
		 if(changedProfile.getAddress3()!= null)
		 {
			 profile.setAddress3(changedProfile.getAddress3());
		 }
		 if(changedProfile.getAddress4()!= null)
		 {
			 profile.setAddress4(changedProfile.getAddress4());
		 }
		 if(changedProfile.getAddress5()!= null)
		 {
			 profile.setAddress5(changedProfile.getAddress5());
		 }
		 
		 if(changedProfile.getPhone_number()!= null)
		 {
			 profile.setPhone_number(changedProfile.getPhone_number());
		 }
		 if(changedProfile.getEmail()!= null)
		 {
			 profile.setEmail(changedProfile.getEmail());
		 }
		 if(changedProfile.getCountry()!= null)
		 {
			 profile.setCountry(changedProfile.getCountry());
		 }
		 if(changedProfile.getPhoto()!= null)
		 {
			 profile.setPhoto(changedProfile.getPhoto());
		 }
			profileRepo.save(profile);

			return "Success";
		}
		return "Invalid data";
	}
	
	
}
