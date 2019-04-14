package com.microserviciu.getProfileInformation.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfileService {

	@Autowired
	private ProfilesRepository profilesRepository;
	
	public List<Profiles> getProfiles() {
		return profilesRepository.findAll();
	}

	public Optional<Profiles> getProfile(String username) {
		return profilesRepository.findById(username);
	}

}
