package com.senderUserManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senderUserManagement.model.Users;

public interface UsersRepository extends JpaRepository<Users,String> {


public boolean existsByPassword(String oldPassword);

}
