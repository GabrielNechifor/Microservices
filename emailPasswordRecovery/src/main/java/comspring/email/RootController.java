package comspring.email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/passwordRecovery")
	public void sendMail() throws MessagingException {
		
		smtpMailSender.send("zornet.samp@gmail.com", "Your iUber password", "Parola ta este blalbal");
		
	}
	

}
