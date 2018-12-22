package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class FirstTest
{
	WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.get("http://selenium4testing.com/");
		Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  
	   driver = new FirefoxDriver();
		Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

  @Test
  public void g()
  {
	  driver.get("http://google.com/");
	  driver.manage().window().maximize();
	  //Thread.sleep(2000);
	  //TakesScreenshot ts=(TakesScreenshot) ((TakesScreenshot)  ( driver)).getScreenshotAs(OutputType.FILE);
	 try{
	  TakesScreenshot ts= ((TakesScreenshot)( driver));
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source,new File("./test-output/gscree2.png"));
	  System.out.println("Screenshort Captured");
	  
  }catch(Exception e){System.out.println("Exp:"+e);}
  finally{System.out.println("finally block");}
  }
  
  @BeforeClass
  public void k(){
	  
	  System.out.println("before");
  }
}
