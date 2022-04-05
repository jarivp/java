package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest
{
	public static WebDriver driver;
  @Test
  public void test1()
  {
	  driver.manage().window().maximize();
		driver.get("http:\\www.adactinhotelapp.com");
		driver.navigate().refresh();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("koreprasad1");
		driver.findElement(By.name("password")).sendKeys("Prako@123");
		driver.findElement(By.id("login")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Sunshine");
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("3 - Three");
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.click();
		date.clear();
		date.sendKeys("01/05/2022");
		WebElement date1 = driver.findElement(By.id("datepick_out"));
		date1.click();
		date1.clear();
		date1.sendKeys("05/05/2022");
		//new Select(driver.findElement(By.id("datepick_in"))).selectByValue("01/04/2022");
		//new Select(driver.findElement(By.id("datepick_out"))).selectByIndex("05/04/2022");
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("1 - One");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Viraj");
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Parmar");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("Mumbai");
		
		WebElement no = driver.findElement(By.id("cc_num"));
		no.sendKeys("1111111111111111");
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(3);
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(6);
		WebElement cc = driver.findElement(By.id("cc_cvv"));
	    cc.sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		//driver.quit();
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://adactinhotelapp.com");
  }
  
  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }
}