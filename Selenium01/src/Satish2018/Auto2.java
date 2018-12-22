package Satish2018;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto2 {
	
	//static WebDriver driver;
@BeforeTest
	public static void createWebdriver(){
		

		//driver=new FirefoxDriver();
	}

	
	@Test(groups={"SmokeTest"})
		public void gTest(){
	    WebDriver driver = new FirefoxDriver();
		//assert false: "not working"; 
		//System.out.println("gmail");
		  driver.get("https://google.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("Gmail")).click();
		  // driver.findElement(By.linkText(" ")).click();
		   try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   driver.navigate().back();
		   driver.navigate().refresh();
		   driver.quit();
		}

	
	      @Test
	      public void dummy(){System.out.println("sample test");}
}
