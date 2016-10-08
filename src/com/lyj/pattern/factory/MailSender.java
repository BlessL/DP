package com.lyj.pattern.factory;

import com.lyj.pattern.interfaces.Sender;

public class MailSender implements Sender
{

	@Override
	public void send()
	{
		System.out.println("this is mail sender!");
	}

}
