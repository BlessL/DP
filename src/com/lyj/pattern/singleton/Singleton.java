package com.lyj.pattern.singleton;

public class Singleton
{
	// private static Singleton instance = new Singleton();

	private Singleton()
	{
	}

	// 类的加载是线程互斥的，保证了线程安全
	private static class SingletonFactory
	{
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance()
	{
		return SingletonFactory.instance;
	}
	/** synchronized 线程安全创建实例 */
	// public static Singleton getInstance()
	// {
	// if (null == instance)
	// {
	// synchronized (instance)
	// {
	// instance = new Singleton();
	// }
	// }
	// return instance;
	// }
}
