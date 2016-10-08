package com.lyj.pattern.visitor;

import com.lyj.pattern.interfaces.Element;
import com.lyj.pattern.interfaces.Visitor;

//访问者模式，适用于数据结构比较稳定的情况，把数据结构和算法解耦
public class MyVisitor implements Visitor
{
	@Override
	public void visit(Element element)
	{
		System.out.println("visit the element:" + element.getElement());
	}
}
