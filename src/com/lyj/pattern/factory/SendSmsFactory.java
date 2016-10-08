package com.lyj.pattern.factory;

import com.lyj.pattern.interfaces.Provider;
import com.lyj.pattern.interfaces.Sender;

public class SendSmsFactory implements Provider
{

	@Override
	public Sender produce()
	{
		return new SmsSender();
	}

}
