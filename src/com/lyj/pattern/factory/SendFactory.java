package com.lyj.pattern.factory;

import com.lyj.pattern.interfaces.Sender;

public class SendFactory
{
	// public Sender produce(String sendType)
	// {
	// if ("mail".equals(sendType))
	// {
	// return new MailSender();
	// }
	// else if ("sms".equals(sendType))
	// {
	// return new SmsSender();
	// }
	// else
	// {
	// System.out.println("please input a correct type");
	// return null;
	// }
	// }
	public static Sender mailProduce()
	{
		return new MailSender();
	}

	public static Sender smsProduce()
	{
		return new SmsSender();
	}

}
