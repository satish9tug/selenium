package udemy.rahul;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

//Lnt icore login example.
public class LocatorEx1 { 
	
public static void main(String[] args) {
	
	LocatorEx1 le = new LocatorEx1();
	le.lntlogin();
	
	
	//	new l lntlogin();
		// TODO Auto-generated method stubl
		/*
		System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\Drivers thirdparty\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://betaeenadu.ne");
		
		driver.navigate().to("https://eenadu.net");
		
		WebElement district= driver.findElement(By.id("dist-option"));
		
	    Select s = new Select(district);
	    
	    s.selectByValue("district/main.aspx?dsname=eastgodavari");
	   lntlogin(){//WebDriver
		*/

	}
	
	public void lntlogin(){//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\Drivers thirdparty\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://icore.lntinfotech.com");
		
		
		
		String expected="Sign in to your account";
		String actual=driver.getTitle();		
		
		if(actual.contains(expected))
		{
			
		WebElement emailid=driver.findElement(By.id("i0116"));
		WebElement emailSubmit =driver.findElement(By.id("idSIButton9"));
		
		
		emailid.sendKeys("satish.thuttagunta@lntinfotech.com");
		emailSubmit.click();
		
		
		WebElement pwdfield = driver.findElement(By.id("passwordInput"));
		
		pwdfield.sendKeys("WelcomE@9");
		
		pwdfield.sendKeys(Keys.TAB);
		pwdfield.sendKeys(Keys.ENTER);
		WebElement nobtn = driver.findElement(By.xpath("//input[@type='button']"));
			    nobtn.click();
			   
			    WebElement logout =driver.findElement(By.xpath("//*[@id='utilityLinksMenuId-inner']/div[2]"));
			    logout.click();
			    
			    WebElement logoutbtn =driver.findElement(By.linkText("Log out"));
			    logoutbtn.click();
			    
			    //driver.close();
		}

      }
	
	public void logout(){
		
		
		
		
		
		 
	}
	
	
}
