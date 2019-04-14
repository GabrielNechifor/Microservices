package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserLoginDataRepository extends CrudRepository<UserLoginData,String>
{

}
