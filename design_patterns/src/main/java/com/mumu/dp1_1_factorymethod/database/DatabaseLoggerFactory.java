package com.mumu.dp1_1_factorymethod.database;

import com.mumu.dp1_1_factorymethod.core.Logger;
import com.mumu.dp1_1_factorymethod.core.LoggerFactory;

// 数据库日志记录器工厂类，充当具体工厂角色
public class DatabaseLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// 连接数据库，代码省略
		// 创建数据库日志记录器对象
		Logger logger = new DatabaseLogger();
		// 初始化数据库日志记录器，代码省略
		return logger;
	}
}
