package Satish2018.guru99exs;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\Drivers thirdparty\\chromedriver_win32\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	        	//this line of code assign  a String object (value)  to max 
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	           
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	           
	            //max = num.toString();
	            m=num.doubleValue();
	           // m = Double.parseDouble(max);
	            
	           if(m>r)
	             {    
	                r=m;
	            }
	        }
	        System.out.println("Maximum current price is : "+ r);
	        wd.close();
	}

}

