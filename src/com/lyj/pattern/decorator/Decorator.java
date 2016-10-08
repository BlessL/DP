package com.lyj.pattern.decorator;

import com.lyj.pattern.interfaces.Sourceable;

public class Decorator implements Sourceable
{

	private Sourceable source;

	public Decorator(Sourceable source)
	{
		super();
		this.source = source;
	}

	@Override
	public void method()
	{
		System.out.println("before decorater");
		source.method();
		System.out.println("after decorater");
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
