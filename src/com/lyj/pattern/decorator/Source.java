package com.lyj.pattern.decorator;

import com.lyj.pattern.interfaces.Sourceable;

public class Source implements Sourceable
{

	@Override
	public void method()
	{
		System.out.println("this is original method");
	}

	@Override
	public void method1()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void method2()
	{
		// TODO Auto-generated method stub

	}

}
