package com.packages.history;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.exceptions.UnknownMatchException;
import com.packages.model.CommandsHistory;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PackagesHistoryService {

	@Autowired
	private CommandsHistoryRepository cmdHistRepo;
	
	public List<CommandsHistory> gePackagesHistoryDriver(String email) throws UnknownMatchException {
		if(!cmdHistRepo.existsByEmailDriver(email)) throw new UnknownMatchException("Nu aveti niciun pachet livrat");
		return cmdHistRepo.findAllByEmailDriver(email);
	}

	public List<CommandsHistory> gePackagesHistorySender(String email) {
		if(!cmdHistRepo.existsByEmailSender(email)) throw new UnknownMatchException("Nu aveti niciun pachet trimis");
		return cmdHistRepo.findAllByEmailSender(email);
	}

}
