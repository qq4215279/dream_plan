package com.mumu.dp1_1_factorymethod.file;

import com.mumu.dp1_1_factorymethod.core.Logger;
import com.mumu.dp1_1_factorymethod.core.LoggerFactory;

// 文件日志记录器工厂类，充当具体工厂角色
public class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
        // 创建文件日志记录器对象
		Logger logger = new FileLogger();
		// 创建文件，代码省略
		return logger;
	}
}
