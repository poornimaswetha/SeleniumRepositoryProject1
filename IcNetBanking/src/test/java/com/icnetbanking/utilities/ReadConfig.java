package com.icnetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// Global Configuration - read the data from data.properties file 
public class ReadConfig {
	Properties prop;

	//constructor
	public ReadConfig() {
		File src = new File("./Configuration/data.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Exception to load file :" + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Exception to open file :" + e.getMessage());
		}
	}
	
	//Methods to read all the values in data.properties file
	public String getapplicationurl() {
		String url=prop.getProperty("baseurl");
		return url;
	}
	
	public String getusername() {
		String uname=prop.getProperty("username");
		return uname;
	}
	
	public String getpassword() {
		String pwd=prop.getProperty("password");
		return pwd;
	}
	
	public String getchromepath() {
		String chrome=prop.getProperty("chromepath");
		return chrome;
	}
	public String getfirefoxpath() {
		String firefox=prop.getProperty("firefoxpath");
		return firefox;
	}
	
	public String getiepath() {
		String ie=prop.getProperty("iepath");
		return ie;
	}
	
	public String getedgepath() {
		String edge=prop.getProperty("edgedriver");
		return edge;
	}
	
	public String getextenetreportpath() {
		String extentrep=prop.getProperty("extentreportpath");
		return extentrep;
	}
	
	public String getbrowsername() {
		String Browsername=prop.getProperty("browser");
		return Browsername;
	}
	
	public String gettestdatapath() {
		String testdatapath=prop.getProperty("testdatapath");
		return testdatapath;
	}
}