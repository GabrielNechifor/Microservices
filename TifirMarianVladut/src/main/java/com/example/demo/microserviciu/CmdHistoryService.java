package com.example.demo.microserviciu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CmdHistoryService implements UserDetailsService {
	@Autowired
	private CmdHistoryRepository cRepo;
	
	
	public String getIstoric(String nume) {
		List<CmdHistory> tmp = cRepo.findAll();
		String history=null;
		for(CmdHistory index:tmp)
		{
			if(index.getName().equals(nume))
			{
				if(history==null)
					history="From:"+index.getFrom()+" To:"+index.getTo()+" Costing:"+index.getPrice()+"RON</br>";
				else
				history+="From:"+index.getFrom()+" To:"+index.getTo()+" Costing:"+index.getPrice()+"RON</br>";
			}
		}
		if(history == null)
		{
			history="No delivery have been made! :(";
		}
		return history;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;	}


}
