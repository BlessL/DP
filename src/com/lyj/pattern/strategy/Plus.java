package com.lyj.pattern.strategy;

import com.lyj.pattern.interfaces.ICalculator;

public class Plus extends AbstractCalculator implements ICalculator
{

	@Override
	public int calculator(String expression)
	{
		int arrayInt[] = split(expression, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

}
