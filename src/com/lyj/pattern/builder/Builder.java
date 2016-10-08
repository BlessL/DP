package com.lyj.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.lyj.pattern.factory.MailSender;
import com.lyj.pattern.factory.SmsSender;
import com.lyj.pattern.interfaces.Sender;

/**
 * @category 建造者模式
 */

public class Builder
{
	/** 跟工厂模式的区别是，工厂模式关注的是单个产品，而建造者模式创建的是复合对象，创建多个部分 */
	private List<Sender> list = new ArrayList<Sender>();

	public List<Sender> getList()
	{
		return list;
	}

	public void setList(List<Sender> list)
	{
		this.list = list;
	}

	public void produceMailSender(int count)
	{
		for (int i = 0; i < count; i++)
		{
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count)
	{
		for (int i = 0; i < count; i++)
		{
			list.add(new SmsSender());
		}
	}
}
