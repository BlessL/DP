package com.lyj.pattern.chain;

import com.lyj.pattern.interfaces.Handler;

//责任链模式，有多个对象，每个对象持有下一个对象的引用，请求在这条链上传递，每个对象处理该请求
public class MyHandler extends AbstractHandler implements Handler
{
	private String name;

	public MyHandler(String name)
	{
		this.name = name;
	}

	@Override
	public void operator()
	{
		System.out.println(this.name + " deal!");
		if (getHandler() != null)
		{
			getHandler().operator();
		}

	}

}
