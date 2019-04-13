package com.example.demo.microserviciu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmdHistoryController {
	
  @Autowired
  CmdHistoryService istoric;
	
	@RequestMapping("/istoric/{user}")
	public String getIstoric(@PathVariable String user){
		return istoric.getIstoric(user);
	}


}
