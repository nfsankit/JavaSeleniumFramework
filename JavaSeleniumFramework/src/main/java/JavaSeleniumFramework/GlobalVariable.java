package JavaSeleniumFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariable 
{
	private Properties obj;
	
	public GlobalVariable(String FileName) throws IOException 
	
	{
		obj = new Properties();					
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\"+FileName+".properties");	
	    obj.load(objfile);	
	}

	public String get(String key)
	{
		return obj.getProperty(key);				
	}
	
	
	
}
