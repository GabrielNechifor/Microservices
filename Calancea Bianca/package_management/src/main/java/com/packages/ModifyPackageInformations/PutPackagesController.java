package com.packages.ModifyPackageInformations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packages.model.ModifyPackageInformation;

@RestController
public class PutPackagesController {

	@Autowired
	PutPackagesService postServ;
	
	 @RequestMapping(method=RequestMethod.PUT,value="/packages/modify")
	 public String postSenderPackage( @RequestBody ModifyPackageInformation form) {
		 return postServ.changePackage(form);
	 }
}
