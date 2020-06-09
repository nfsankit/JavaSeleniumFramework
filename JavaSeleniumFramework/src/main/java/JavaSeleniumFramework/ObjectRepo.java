package JavaSeleniumFramework;

import java.io.File;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;

public class ObjectRepo
{
	
	private Document File;
	
	public ObjectRepo(String FileName) throws DocumentException
	{
			File inputFile = new File(System.getProperty("user.dir") +"\\"+FileName+".xml");									
		    SAXReader saxReader = new SAXReader();					
		    File= saxReader.read(inputFile);
		
	}
	
	public By get(String TestObj)
	{
		return By.xpath(File.selectSingleNode(TestObj).getText());	
	}

}
