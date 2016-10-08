package com.lyj.pattern.factory;

import com.lyj.pattern.interfaces.Provider;
import com.lyj.pattern.interfaces.Sender;

public class SendMailFactory implements Provider
{

	@Override
	public Sender produce()
	{
		return new MailSender();
	}

}
