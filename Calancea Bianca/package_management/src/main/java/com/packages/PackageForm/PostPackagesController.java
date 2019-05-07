package com.packages.PackageForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packages.model.CommandsHistory;
import com.packages.model.RegisterPackage;

@RestController
public class PostPackagesController {

	@Autowired
	PostPackagesService postServ;
	
	 @RequestMapping(method=RequestMethod.POST,value="/packages/registerPackage")
	 public CommandsHistory postSenderPackage(@RequestBody RegisterPackage form) {
		 return postServ.postPackage(form);
	 }

}
