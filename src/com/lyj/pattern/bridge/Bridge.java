package com.lyj.pattern.bridge;

import com.lyj.pattern.interfaces.Sourceable;

public abstract class Bridge
{
	private Sourceable source;

	public void method()
	{
		source.method();
	}

	public Sourceable getSource()
	{
		return source;
	}

	public void setSource(Sourceable source)
	{
		this.source = source;
	}

}
