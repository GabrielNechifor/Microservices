package com.example.demo.microserviciu.cursuri;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.microserviciu.login.LoginDataRepository;

@Service
public class CursuriService {
	
	@Autowired
	private CursuriRepository cursuriRepository;
	
	@Autowired
	private JwtCursuriDetails jwtCursuriDetails;
	
	@Autowired
	private JwtCursuri jwtCursuri;

	public List<Cursuri> getCursuri() {
		return cursuriRepository.findAll();
	}

	
	public Optional<Cursuri> getCurs(String id) {

		return cursuriRepository.findById(id);
	}
	
	
	public String setCursObj(Cursuri curs) {
		if(jwtCursuriDetails.getUsername().equals(curs.getNume()))
        {		cursuriRepository.save(curs);
        return "Success";
        }
     return "Error";
	}
	
			

			public String deleteCurs(String id) {
				if(jwtCursuriDetails.getUsername().equals(id))
			            {cursuriRepository.deleteById(id);
			            return "Success";
			            }
				return "Error";
				
			}
			
			

}
