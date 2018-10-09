package com.ivy.github.day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

//加载资源文件
public class LoadResources {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// 方式1.使用绝对路径
		String path = "D:\\workspace\\JSE\\JavaSE_Basic\\resources\\db.properties";

		// 方式2：使用相对路径-相对于classpath的根路径

		ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
		Properties p2 = new Properties();
		p2.load(loader2.getResourceAsStream("db.properties"));

		System.out.println(p2);
		//方式3：使用相对路径-相对于当前加载资源文件的字节码路径

		ClassLoader loader = LoadResources.class.getClassLoader();
		URL uri = loader.getResource("db.properties");
		System.out.println(uri);//file:/D:/workspace/JSE/JavaSE_Basic/bin/db.properties
		InputStream is = loader.getResourceAsStream("db.properties");
		Properties p = new Properties();
		//		p.load(new FileInputStream(new File(path)));
		p.load(is);
		System.out.println(p);

	}

}
