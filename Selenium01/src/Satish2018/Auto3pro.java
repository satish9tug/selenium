package Satish2018;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Auto3pro {

	@Test
	public void hitUrl() throws IOException{
		
		
		//String browser;
		Properties p =new Properties();
		FileInputStream fis = new FileInputStream("D:\\workspace2\\SeleniumNew\\Selenium01\\src\\DataDriven.properties");
		p.load(fis);
			
		
if(p.getProperty("browser").equals("firefox")){
	//if(true){
WebDriver driver=new FirefoxDriver();


driver.get(p.getProperty("url"));

}else{System.out.println("Else case");}
	
	fis.close();
		
}
	
}
