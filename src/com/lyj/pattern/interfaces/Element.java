package com.lyj.pattern.interfaces;

public interface Element
{
	public void accept(Visitor visitor);

	public String getElement();

}
