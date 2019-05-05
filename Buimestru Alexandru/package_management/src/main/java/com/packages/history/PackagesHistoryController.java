package com.packages.history;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.model.CommandsHistory;

@RestController
public class PackagesHistoryController {
	
	@Autowired
	private PackagesHistoryService packagesHistoryService;
	
	 @RequestMapping("/packages/driver/{email}")
	 public ResponseEntity<List<CommandsHistory>> getPackagesHistoryDriver(@PathVariable String email)  {
		 return ResponseEntity.ok(packagesHistoryService.gePackagesHistoryDriver(email));
	 }
	 
	 @RequestMapping("/packages/sender/{email}")
	 public ResponseEntity<List<CommandsHistory>> getPackagesHistorySender(@PathVariable String email)  {
		 return ResponseEntity.ok(packagesHistoryService.gePackagesHistorySender(email));
	 }
}
