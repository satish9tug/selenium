package udemy.rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1Chk {

	WebDriver driver;
	WebElement checkop1;

	@BeforeTest
	public void manageDriver() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium softwares\\Drivers thirdparty\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		checkop1 = driver.findElement(By.xpath("//input[@value='option1']"));
	}

	@Test
	public void checkBoxEnabledTest() {

		Assert.assertTrue(checkop1.isEnabled());
		System.out.println("CheckBoxEnabled..!");

	}

	@Test
	public void checkBoxisSelectedTest() {

		Assert.assertFalse(checkop1.isSelected());

	}

	@Test
	public void checkBoxSelectTest() {

		/*
		 * driver.get("http://qaclickacademy.com/practice.php"); checkop1 =
		 * driver.findElement(By.xpath("//input[@value='option1']"));
		 */

		checkop1.click();

		System.out.println("check box selected..!");

	}

	@Test
	public void checkBoxSelectvalidationTest() {

		Assert.assertTrue(checkop1.isSelected());
		/*
		 * boolean select_status=checkop1.isSelected();
		 * if(select_status){System.out.println("This is selected..");}
		 * else{System.out.println("This is selected..");
		 */

	}

	@AfterTest
	public void closeAllResource() {

		driver.close();
	}
}
