package com.tx.pattern.test;

import org.junit.Test;

import com.tx.pattern.factory.simple.Sender;
import com.tx.pattern.factory.simple.SenderFactory;

public class FactoryPatternTest {

	@Test
	public void testSimpleFactory()
	{
		SenderFactory sf = new SenderFactory();
		Sender sender = sf.product("smsse");
		sender.send();
	}
}
