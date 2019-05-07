package com.packages.ModifyPackageInformations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.exceptions.UnknownMatchException;
import com.packages.model.CommandsHistory;
import com.packages.model.ModifyPackageInformation;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PutPackagesService {

	@Autowired
	private CommandsHistoryRepository cmdHistRepo;
	
	public String changePackage(ModifyPackageInformation form) {
		CommandsHistory cmd= new CommandsHistory();
		if(form.getId()==0 || form.getStatus()==null || form.getEmailDriver()==null) throw new UnknownMatchException("Date invalide");
		if(!form.getStatus().equals("Accepted") && !form.getStatus().equals("In Delivery") && !form.getStatus().equals("Delivered")) 
			throw new UnknownMatchException("Status invalid");
		cmd=cmdHistRepo.findById(form.getId()).get();
		if(cmd.getEmail_driver()==null && form.getStatus().equals("Accepted")) {
			cmd.setEmail_driver(form.getEmailDriver());
			cmd.setStatus(form.getStatus());
		}
		else {
			if(cmd.getEmail_driver().equals(form.getEmailDriver())) {
				cmd.setStatus(form.getStatus());
			}
			else throw new UnknownMatchException("Date invalide");
		}
		cmdHistRepo.save(cmd);
		return "Success";
	}
}
