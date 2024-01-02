package com.codewithsaurabh.email_demo_sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	JavaMailSender jms;
	
	public void sendEmail(String toEmail,String subject, String body ) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		jms.send(message);
		
		System.out.println("Email send successfully!");
	}

}
