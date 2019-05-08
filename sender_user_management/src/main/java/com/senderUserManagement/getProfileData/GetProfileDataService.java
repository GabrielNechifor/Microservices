package com.senderUserManagement.getProfileData;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senderUserManagement.model.JwtUser;
import com.senderUserManagement.model.Profiles;
import com.senderUserManagement.repositories.ProfilesRepository;


@Service
public class GetProfileDataService {

	@Autowired
	private ProfilesRepository profilesRepository;
	
	public List<Profiles> getProfiles() {
		return profilesRepository.findAll();
	}

	public Optional<Profiles> getProfile(String username) throws IOException {
		if(JwtUser.getUserName().equals(username)&&JwtUser.getRole().equals("sender")) {
		return profilesRepository.findById(username);
		}
		else throw new IOException("Invalid username");
	}

}
