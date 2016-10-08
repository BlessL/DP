package com.lyj.pattern.observer;

import com.lyj.pattern.interfaces.Observer;

public class Observer2 implements Observer
{

	@Override
	public void update()
	{
		System.out.println("observer2 has received!");
	}

}
