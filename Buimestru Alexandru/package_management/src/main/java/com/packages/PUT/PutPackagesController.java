package com.packages.PUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packages.model.DriverForm;

@RestController
public class PutPackagesController {

	@Autowired
	PutPackagesService postServ;
	
	 @RequestMapping(method=RequestMethod.PUT,value="/packages/sender/{id}")
	 public void postSenderPackage(@PathVariable int id, @RequestBody DriverForm form) {
		 postServ.changePackage(id,form);
	 }
}
