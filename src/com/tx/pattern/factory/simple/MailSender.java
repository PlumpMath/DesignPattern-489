package com.tx.pattern.factory.simple;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("MailSender");
	}

	
}
