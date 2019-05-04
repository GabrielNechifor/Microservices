package com.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.model.Location;

public interface AddressesRepository extends JpaRepository<Location,Integer> {

}
