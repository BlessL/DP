package com.lyj.pattern.strategy;

//策略模式选择哪个算法由用户决定，系统本身提供不同的算法
public abstract class AbstractCalculator
{
	public int[] split(String exp, String opt)
	{
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
