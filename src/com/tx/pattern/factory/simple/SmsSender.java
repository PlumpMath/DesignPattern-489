package com.tx.pattern.factory.simple;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("SmsSender");
	}

}
