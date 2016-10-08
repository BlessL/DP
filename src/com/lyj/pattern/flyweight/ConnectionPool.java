package com.lyj.pattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/** 享元模式，数据库连接池为例子。对象池若有符合对象则返回，没有则创建 */
public class ConnectionPool
{
	private Vector<Connection> pool;

	/** 公共属性 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolsize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	private ConnectionPool()
	{
		pool = new Vector<Connection>(poolsize);

		for (int i = 0; i < poolsize; i++)
		{
			try
			{
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			}
			catch (ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	/** 返回连接到连接池 */
	public synchronized void release()
	{
		pool.add(conn);
	}

	public synchronized Connection getConnection()
	{
		if (pool.size() > 0)
		{
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		}
		else
		{
			return null;
		}
	}
}
