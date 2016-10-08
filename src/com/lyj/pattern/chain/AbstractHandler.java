package com.lyj.pattern.chain;

import com.lyj.pattern.interfaces.Handler;

public abstract class AbstractHandler
{
	private Handler handler;

	public Handler getHandler()
	{
		return handler;
	}

	public void setHandler(Handler handler)
	{
		this.handler = handler;
	}

}
