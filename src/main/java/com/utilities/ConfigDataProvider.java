package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

Properties pro;
	
	public ConfigDataProvider () throws Exception {
		String path=System.getProperty("user.dir")+"\\Config\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String Reba_Rent() {
		return pro.getProperty("Reba_Rent");
	}
}
