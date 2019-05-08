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
	
	public void changePackage(ModifyPackageInformation form) {
		CommandsHistory cmd= new CommandsHistory();
		if(form.getId()==null) throw new UnknownMatchException("Date invalide");
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
	}
}
