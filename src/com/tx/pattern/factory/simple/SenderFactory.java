package com.tx.pattern.factory.simple;

public class SenderFactory {
	
	private Sender sender = null;
	public Sender product(String type)
	{
		 
		if(type.equals("mail"))
		{
			sender = new MailSender();
			return sender;
		}
		else if(type.equals("sms"))
		{
			sender = new SmsSender();
			return sender;
		}
		else
		{
			System.out.println("现只支持sms和mail类型Sender");
			return null;
		}
	}
}
