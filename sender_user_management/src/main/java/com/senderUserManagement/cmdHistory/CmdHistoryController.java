package com.senderUserManagement.cmdHistory;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senderUserManagement.model.CommandsHistory;

@RestController
public class CmdHistoryController {
	
  @Autowired
  CmdHistoryService istoric;
	
	@RequestMapping("/senderUserManagement/commandHistory/{user}")
	public List<CommandsHistory> getIstoric(@PathVariable String user) throws IOException{
		return istoric.getIstoric(user);
	}


}
