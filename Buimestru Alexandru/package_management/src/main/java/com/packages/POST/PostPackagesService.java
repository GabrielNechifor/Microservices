package com.packages.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.model.CommandsHistory;
import com.packages.model.SenderForm;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PostPackagesService {

	@Autowired
	private CommandsHistoryRepository cmdHistRepo;
	
	public void postPackage(SenderForm form) {
		CommandsHistory cmdHist = new CommandsHistory();
		cmdHist.setEmail_sender(form.getEmailSender());
		cmdHist.setEmail_driver("null");
		cmdHist.setKilograms(form.getKilograms());
		cmdHist.setPhone_number_sender(form.getPhone_number_sender());
		cmdHist.setPhone_number_receiver(form.getPhone_number_receiver());
		cmdHist.setSender_adress(form.getSender_adress());
		cmdHist.setReceiver_adress(form.getReceiver_adress());
		cmdHist.setVolume(form.getVolume());
		cmdHist.setStatus("Ready");
		int pin = (int )(Math.random() * 100000);
		while(cmdHistRepo.existsById(pin)) {
			pin = (int )(Math.random() * 100000);
		}
		cmdHist.setPin(pin);
		cmdHistRepo.save(cmdHist);
	}
	
}
