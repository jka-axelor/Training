package com.axelor.mail;

import java.util.List;

import javax.mail.internet.InternetAddress;

import com.axelor.db.Model;
import com.axelor.mail.db.MailMessage;
import com.axelor.mail.service.MailService;

public class MyMailServiceImp implements MailService{

	@Override
	public void send(MailMessage message) throws MailException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetch() throws MailException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Model resolve(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InternetAddress> findEmails(String matching, List<String> selected, int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

}
