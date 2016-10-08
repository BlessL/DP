package com.lyj.pattern.adapter;

import com.lyj.pattern.interfaces.Sourceable;

public class Wrapper implements Sourceable
{

	@Override
	public void method1()
	{
		System.out.println("Wrapper's method1");
	}

	@Override
	public void method2()
	{
		System.out.println("Wrapper's method2");
	}

	@Override
	public void method()
	{
		// TODO Auto-generated method stub

	}

}
