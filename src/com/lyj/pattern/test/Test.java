package com.lyj.pattern.test;

public class Test
{
	public static void main(String[] args)
	{
		// 解释器模式
		// int result = new Minus().interpret(new Context(new
		// Plus().interpret(new Context(9, 2)), 8));
		// System.out.println(result);

		// 中介者模式
		// Mediator mediator = new MyMediator();
		// mediator.createMediator();
		// mediator.workAll();

		// // 访问者模式
		// Visitor visitor = new MyVisitor();
		// Element element = new MyElement();
		// element.accept(visitor);

		// 状态模式
		// State state = new State();
		// Context context = new Context(state);
		//
		// state.setValue("state2");
		// context.method();
		//
		// state.setValue("state1");
		// context.method();

		// 备忘录模式memento
		// Original original = new Original("cat");
		// Storage storage = new Storage(original.createMemento());
		//
		// System.out.println("初始化：" + original.getValue());
		// original.setValue("dog");
		// System.out.println("更改后：" + original.getValue());
		//
		// // 恢复到初始状态
		// original.restoreMemento(storage.getMemento());
		// System.out.println("恢复后：" + original.getValue());

		// 命令模式
		// Receiver receiver = new Receiver();
		// Command command = new MyCommand(receiver);
		// Invoker invoker = new Invoker(command);
		// invoker.action();

		// 责任链模式
		// MyHandler h1 = new MyHandler("h1");
		// MyHandler h2 = new MyHandler("h2");
		// MyHandler h3 = new MyHandler("h3");
		//
		// h1.setHandler(h2);
		// h2.setHandler(h3);
		// h1.operator();

		// 迭代器模式
		// Collection collection = new MyCollection();
		// Iterator iterator = collection.iterator();
		//
		// while (iterator.hasNext())
		// {
		// System.out.println(iterator.next());
		// }

		// 观察者模式
		// Subject sub = new MySubject();
		// sub.add(new Observer1());
		// sub.add(new Observer2());
		// sub.operation();

		// 策略模式
		// ICalculator cal = new Plus();
		// int result = cal.calculator("2-8");
		// System.out.println(result);

		// // 组合模式
		// Tree tree = new Tree("A");
		// TreeNode nodeB = new TreeNode("B");
		// TreeNode nodeC = new TreeNode("C");
		// nodeB.add(nodeC);
		// tree.getRoot().add(nodeB);

		// // 桥接模式
		// Bridge bridge = new MyBridge();
		// // 调用第一个对象
		// SourceSub1 source1 = new SourceSub1();
		// bridge.setSource(source1);
		// bridge.method();
		// // 调用第二个对象
		// SourceSub2 source2 = new SourceSub2();
		// bridge.setSource(source2);
		// bridge.method();

		// 外观模式
		// Computer computer = new Computer();
		// computer.startup();
		// computer.shutdown();

		// 代理模式
		// Sourceable source = new Proxy();
		// source.method();

		// 装饰器模式，就是给对象添加新功能
		// Sourceable source = new Source();
		// Sourceable object = new Decorator(source);
		// object.method();

		// // 接口适配器模式
		// Sourceable source1 = new SourceSub1();
		// source1.method1();
		// source1.method2();
		//
		// Sourceable source2 = new SourceSub2();
		// source2.method1();
		// source2.method2();

		// 原型模式(浅复制)
		// ProtoType proto = new ProtoType();
		// System.out.println(proto);
		// try
		// {
		// ProtoType protoClone = (ProtoType) proto.clone();
		// System.out.println(protoClone);
		// }
		// catch (CloneNotSupportedException e)
		// {
		// e.printStackTrace();
		// }

		// 建造者模式
		// Builder builder = new Builder();
		// builder.produceSmsSender(10);
		// for (int i = 0; i < builder.getList().size(); i++)
		// {
		// System.out.println(builder.getList().get(i));
		// }
		//

		// 单例模式
		// Singleton instance = Singleton.getInstance();
		// System.out.println(instance);

		// 抽象工厂模式
		// Provider provider = new SendSmsFactory();
		// Sender sender = provider.produce();
		// sender.send();

		// 工厂方法模式
		// Sender sender = SendFactory.mailProduce();
		// sender.send();
	}
}
