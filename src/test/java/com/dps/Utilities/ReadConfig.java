package com.dps.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
   
	public ReadConfig() {
    	File src= new File("./Configuration\\config.properties");
    	try {
    	FileInputStream fi=new FileInputStream(src);
    	pro=new Properties();
    	pro.load(fi);
    	}catch (Exception e) {
    	System.out.println("exception is"+ e.getMessage());
    	     }
                        }
	    public String getappurl() {
		String url=pro.getProperty("baseURL");
		return url;
		
	    }
	    public String getusername() {
			String userename=pro.getProperty("username");
			return userename;
	    }

	    public String getpassword() {
			String password=pro.getProperty("password");
			return password;
	    }
	    
	    public String getchromepath() {
			String chromepath=pro.getProperty("chromepath");
			return chromepath;

	    }
	    
	    public String getfirepath() {
			String firepath=pro.getProperty("firepath");
			return firepath;

	    }
	    
	    public String getedgepath() {
			String edgepath=pro.getProperty("edgepath");
			return edgepath;

	    }







}
