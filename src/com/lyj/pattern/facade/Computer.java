package com.lyj.pattern.facade;

/** 外观模式是将类与类的关系放在一个facade类中，降低类与类间的耦合度，该模式没有涉及接口 */

public class Computer
{
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer()
	{
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup()
	{
		System.out.println("start the computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start the finished!");
	}

	public void shutdown()
	{
		System.out.println("begin to close the computer");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed");
	}

}
