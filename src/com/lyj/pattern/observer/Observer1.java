package com.lyj.pattern.observer;

import com.lyj.pattern.interfaces.Observer;

public class Observer1 implements Observer
{

	@Override
	public void update()
	{
		System.out.println("observer1 has received!");
	}

}
