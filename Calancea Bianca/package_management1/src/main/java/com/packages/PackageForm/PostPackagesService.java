package com.packages.PackageForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.exceptions.UnknownMatchException;
import com.packages.model.CommandsHistory;
import com.packages.model.RegisterPackage;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PostPackagesService {

	@Autowired
	private CommandsHistoryRepository cmdHistRepo;
	
	public CommandsHistory postPackage(RegisterPackage form) {
		if(form.getEmailSender()==null || form.getKilograms()<=0 || form.getPhone_number_receiver()==null ||
				form.getPhone_number_sender()==null || form.getReceiver_adress()==null || form.getSender_adress()==null ||
				form.getVolume()<=0) throw new UnknownMatchException("Date invalide sau incomplete");
		CommandsHistory cmdHist = new CommandsHistory();
		cmdHist.setEmail_sender(form.getEmailSender());
		cmdHist.setEmail_driver(null);
		cmdHist.setKilograms(form.getKilograms());
		cmdHist.setPhone_number_sender(form.getPhone_number_sender());
		cmdHist.setPhone_number_receiver(form.getPhone_number_receiver());
		cmdHist.setSender_adress(form.getSender_adress());
		cmdHist.setReceiver_adress(form.getReceiver_adress());
		cmdHist.setVolume(form.getVolume());
		cmdHist.setStatus("Ready");
		int pin = (int )(Math.random() * 100000);
		while(cmdHistRepo.existsByPin(pin)) {
			pin = (int )(Math.random() * 100000);
		}
		cmdHist.setPin(pin);
		cmdHistRepo.save(cmdHist);
		return cmdHistRepo.findByPin(pin).get();
	}
	
}
