package sampal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateUser {
	
	
	@Test
	public void createUser()
	{
		System.out.println("Create User");
		
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser");
		
		System.out.println(URL+" "+Browser);
		
		WebDriver driver;
		
		if(Browser.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		
		else if(Browser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else
		{
			 driver=new ChromeDriver();
		}
	}
		
		@Test
		public void createOrg()
		{
			System.out.println("jenkins poll scm");
		}
		
		
	
		
}

	


