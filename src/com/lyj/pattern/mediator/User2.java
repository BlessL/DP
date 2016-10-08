package com.lyj.pattern.mediator;

import com.lyj.pattern.interfaces.Mediator;

public class User2 extends User
{
	public User2(Mediator mediator)
	{
		super(mediator);
	}

	@Override
	public void work()
	{
		System.out.println("user2 execute!");

	}

}
