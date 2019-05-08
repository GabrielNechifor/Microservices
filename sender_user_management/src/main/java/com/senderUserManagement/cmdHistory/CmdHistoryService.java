package com.senderUserManagement.cmdHistory;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senderUserManagement.model.CommandsHistory;
import com.senderUserManagement.model.JwtUser;
import com.senderUserManagement.repositories.CommandsHistoryRepository;

@Service
public class CmdHistoryService{
	@Autowired
	private CommandsHistoryRepository cRepo;
	
	
	public CommandsHistoryRepository getcRepo() {
		return cRepo;
	}


	public void setcRepo(CommandsHistoryRepository cRepo) {
		this.cRepo = cRepo;
	}


	public List<CommandsHistory> getIstoric(String nume) throws IOException {
		if(JwtUser.getUserName().equals(nume) && JwtUser.getRole().equals("sender"))
		   return cRepo.findAllByUsername(nume);
		else throw new IOException("Invalid username");
	}


}
