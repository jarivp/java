package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.get("http:\\www.adactinhotelapp.com");
		driver.navigate().refresh();
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("koreprasad1");
		driver.findElement(By.id("password")).sendKeys("Prako@123");
		driver.findElement(By.name("login")).click();
		//driver.quit();
	}

}
