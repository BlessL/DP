package com.lyj.pattern.command;

import com.lyj.pattern.interfaces.Command;

public class Invoker
{
	Command command;

	public Invoker(Command command)
	{
		this.command = command;
	}

	public void action()
	{
		command.exe();
	}
}
