package com.lyj.pattern.proxy;

import com.lyj.pattern.decorator.Source;
import com.lyj.pattern.interfaces.Sourceable;

/** 代理模式，多一个代理类替原对象进行一些操作而不需要修改原对象 */

public class Proxy implements Sourceable
{

	public Source source;

	public Proxy()
	{
		super();
		this.source = new Source();
	}

	@Override
	public void method()
	{
		before();
		source.method();
		after();
	}

	private void before()
	{
		System.out.println("before proxy");
	}

	private void after()
	{
		System.out.println("after proxy");
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
