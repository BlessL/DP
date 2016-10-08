package com.lyj.pattern.visitor;

import com.lyj.pattern.interfaces.Element;
import com.lyj.pattern.interfaces.Visitor;

public class MyElement implements Element
{

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

	@Override
	public String getElement()
	{
		return "bless";
	}

}
