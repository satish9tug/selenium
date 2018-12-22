package Satish2018.guru99exs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Seautoex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\Drivers thirdparty\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://google.com");
	String actual = driver.getTitle();
	String expected ="Google";
System.out.println(actual);
if(actual.contentEquals(expected))

{
	System.out.println("Test passed..!");
	
}else{System.out.println("Test Failed");}
	}

}
