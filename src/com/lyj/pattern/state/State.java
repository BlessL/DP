package com.lyj.pattern.state;

//状态改变，改变行为
public class State
{
	private String value;

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public void method1()
	{
		System.out.println("execute the first method1");
	}

	public void method2()
	{
		System.out.println("execute the second method2");
	}
}
