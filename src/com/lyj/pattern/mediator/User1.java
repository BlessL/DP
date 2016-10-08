package com.lyj.pattern.mediator;

import com.lyj.pattern.interfaces.Mediator;

public class User1 extends User
{
	public User1(Mediator mediator)
	{
		super(mediator);
	}

	@Override
	public void work()
	{
		System.out.println("user1 execute!");

	}

}
