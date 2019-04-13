package com.example.demo.microserviciu.cursuri;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursuriController {
	
  @Autowired
  CursuriService cursuri;
	
	@RequestMapping("/cursuri")
	public List<Cursuri> getCursuri(){
		return cursuri.getCursuri();
	}
	@RequestMapping("/cursuri/{id}")
 public Optional<Cursuri> getCurs( @PathVariable String id) {
	 return cursuri.getCurs(id);
	}
	 

	 
	 @RequestMapping(method=RequestMethod.POST,value="/cursuri")
	 public String setCursObj(@RequestBody Cursuri curs) {
		 return cursuri.setCursObj(curs);
	 }
	 
	 @RequestMapping(method=RequestMethod.DELETE,value="/cursuri/{id}")
	 public String deleteCurs(@PathVariable String id) {
		 return cursuri.deleteCurs(id);
	 }

}
