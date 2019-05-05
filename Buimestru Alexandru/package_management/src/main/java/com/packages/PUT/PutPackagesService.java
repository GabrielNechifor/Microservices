package com.packages.PUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.model.DriverForm;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PutPackagesService {

	@Autowired
	private CommandsHistoryRepository cmdHistRepo;
	
	public void changePackage(int id, DriverForm form) {
		if(cmdHistRepo.findById(id).get().getEmail_driver().equals("null") && form.getStatus().equals("Accepted")) {
			cmdHistRepo.findById(id).get().setEmail_driver(form.getEmailDriver());
			cmdHistRepo.findById(id).get().setStatus(form.getStatus());
		}
		else {
			if(cmdHistRepo.findById(id).get().getEmail_driver().equals(form.getEmailDriver())) {
				cmdHistRepo.findById(id).get().setStatus(form.getStatus());
			}
		}
	}
}
