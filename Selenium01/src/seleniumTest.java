import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(2000);
		driver.get("http://selenium4testing.com/");
		//Thread.sleep(2000);
		driver.close();

	}

}
