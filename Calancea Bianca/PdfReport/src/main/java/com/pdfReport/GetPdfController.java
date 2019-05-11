package com.pdfReport;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GetPdfController {

	
	@Autowired
	GetPdfService getPdfController;
	
	@RequestMapping(method=RequestMethod.POST,value="/bill/generateBill")
	public String getBill(@RequestHeader("Authorization") String token) throws IOException
	{
		return  getPdfController.getBill(token);
	}
}


