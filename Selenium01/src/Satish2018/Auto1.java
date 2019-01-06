package Satish2018;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Auto1 {

	static WebDriver driver;

	@BeforeMethod(groups = { "SmokeTest" })
	public static void createWebdriver() {

		driver = new FirefoxDriver();
	}

	@Test(priority = 1, enabled = false)
	public void gTest() {
		// WebDriver driver = Auto1.getWebdriver();
		// assert false: "not working";
		// System.out.println("gmail");
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

	@Test(priority = 1, groups = { "SmokeTest" })
	public void dropdownTest() throws InterruptedException {

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		driver.findElement(By.name("firstName")).sendKeys("Sourish");

		driver.findElement(By.name("lastName")).sendKeys("Skandh");

		driver.findElement(By.name("phone")).sendKeys("9393789967");

		driver.findElement(By.name("email")).sendKeys("satish9tug@gmail.com");

		driver.findElement(By.name("address1")).sendKeys("1/3,ramapuram");

		driver.findElement(By.name("city")).sendKeys("Chennai");

		driver.findElement(By.name("state")).sendKeys("Tamilnadu");

		driver.findElement(By.name("postalCode")).sendKeys("600089");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.name("country"));
		jse.executeScript("arguments[0].scrollIntoView();", element);

		Select dphandle = new Select(driver.findElement(By.name("country")));

		Thread.sleep(7000);
		dphandle.selectByVisibleText("INDIA");

		// driver.close();
	}

}
