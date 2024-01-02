package com.codewithsaurabh.email_demo_sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailDemoSenderApplication {
	
	@Autowired
	EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailDemoSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		emailService.sendEmail("saurabh93289@gmail.com", "Test Email", "This is test email body...");
		
	}

}
