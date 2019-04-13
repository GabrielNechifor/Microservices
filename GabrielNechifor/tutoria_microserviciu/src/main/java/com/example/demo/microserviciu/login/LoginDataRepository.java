package com.example.demo.microserviciu.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDataRepository extends JpaRepository<LoginData,String> {

}
