package com.lyj.pattern.command;

import com.lyj.pattern.interfaces.Command;

//命令模式，实现命令发出者与执行者直接解耦，即实现与请求分离
public class MyCommand implements Command
{
	private Receiver receiver;

	public MyCommand(Receiver receiver)
	{
		this.receiver = receiver;
	}

	@Override
	public void exe()
	{
		receiver.action();
	}

}
