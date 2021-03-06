package com.lyj.pattern.interpreter;

import com.lyj.pattern.interfaces.Expression;

public class Minus implements Expression
{
	@Override
	public int interpret(Context context)
	{
		return context.getNum1() - context.getNum2();
	}

}
