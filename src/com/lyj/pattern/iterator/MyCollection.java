package com.lyj.pattern.iterator;

import com.lyj.pattern.interfaces.Collection;
import com.lyj.pattern.interfaces.Iterator;

public class MyCollection implements Collection
{
	public String string[] = { "B", "A", "W", "G", "C" };

	@Override
	public Iterator iterator()
	{
		return new MyIterator(this);
	}

	@Override
	public Object get(int i)
	{
		return string[i];
	}

	@Override
	public int size()
	{
		return string.length;
	}

}
