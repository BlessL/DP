package com.lyj.pattern.prototype;

public class ProtoType implements Cloneable
{
	public Object clone() throws CloneNotSupportedException
	{
		ProtoType proto = (ProtoType) super.clone();
		return proto;
	}
}
