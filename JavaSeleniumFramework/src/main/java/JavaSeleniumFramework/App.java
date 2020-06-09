package JavaSeleniumFramework;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
    public static void main( String[] args ) throws DocumentException, IOException, InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver Driver = new ChromeDriver();
    	
    	ObjectRepo ObjRep = new ObjectRepo("OR"); 
    	GlobalVariable GV = new GlobalVariable("GlobalVariable");
    	
    	Driver.get(GV.get("url"));
    	
    		
    	Driver.findElement(ObjRep.get("//menupage/SearcBox")).sendKeys("naukari.com");
    	Driver.findElement(ObjRep.get("//menupage/SearcBox")).sendKeys(Keys.ENTER); 
    	//Driver.wait(5000);
    	Driver.quit();
    }
}
