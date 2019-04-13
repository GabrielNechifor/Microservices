package com.microserviciu.modifyProfileData.profile;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileForm,String> {

}
