package testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;


	@Test
	public void setup() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ferlini.it/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("Title of the page is- "+title);
	Thread.sleep(3);
	driver.findElement(By.xpath("//span[contains(text(),'Contattaci')]")).click();
	String titleCon=driver.getTitle();
	System.out.println("Title of the Contattaci page is-"+titleCon);
	// driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]")).click();


	driver.findElement(By.xpath("//textarea[@id='textarea-yui_3_17_2_53_1489218200494_4206-field']")).sendKeys("Welcome To Ferlini");
	driver.findElement(By.xpath("//input[@id='text-yui_3_17_2_1_1490690886464_15563-field']")).sendKeys("Sonali Torkadi");
	driver.findElement(By.xpath("//input[@id='text-yui_3_17_2_1_1490690886464_16230-field']")).sendKeys("Betsol");
	driver.findElement(By.xpath("//input[@id='email-yui_3_17_2_53_1489218200494_4204-field']")).sendKeys("sonalitorkadi@gmail.com");
	driver.findElement(By.xpath("//input[@data-title='Country']")).sendKeys("91");
	driver.findElement(By.xpath("//input[@data-title='Areacode']")).sendKeys("877");
	driver.findElement(By.xpath("//input[@data-title='Prefix']")).sendKeys("926");
	driver.findElement(By.xpath("//input[@data-title='Line']")).sendKeys("5994");
	Thread.sleep(3);


	driver.findElement(By.xpath("//input[@type='submit']")).click();


	String msg = driver.findElement(By.xpath("//input[@type='submit']")).getTagName();


	//System.out.println();








	}



}
