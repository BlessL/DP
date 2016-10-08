package com.lyj.pattern.mediator;

import com.lyj.pattern.interfaces.Mediator;

public abstract class User
{
	private Mediator mediator;

	public Mediator getMediator()
	{
		return mediator;
	}

	public User(Mediator mediator)
	{
		this.mediator = mediator;
	}

	public abstract void work();
}
