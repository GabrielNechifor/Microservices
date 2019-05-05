package com.packages.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packages.model.SenderForm;

@RestController
public class PostPackagesController {

	@Autowired
	PostPackagesService postServ;
	
	 @RequestMapping(method=RequestMethod.POST,value="/packages/sender")
	 public void postSenderPackage(@RequestBody SenderForm form) {
		 postServ.postPackage(form);
	 }

}
