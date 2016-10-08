package com.lyj.pattern.mediator;

import com.lyj.pattern.interfaces.Mediator;

//中介者模式，类与类间的关系及调度交给中介类，解耦类类间的联系
public class MyMediator implements Mediator
{
	private User user1;
	private User user2;

	public User getUser1()
	{
		return user1;
	}

	public User getUser2()
	{
		return user2;
	}

	@Override
	public void createMediator()
	{
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll()
	{
		user1.work();
		user2.work();
	}

}
