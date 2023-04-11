package prac1WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4task3 {

	public static void main(String args[])
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("==remote=allow=origins=*");
	
	driver=new ChromeDriver(co);
	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
//	driver.navigate().to("https://www.google.com);
	WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
	name.sendKeys("Priyanka");
	WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
	email.sendKeys("jayanthipriya155@gmail.com");
	WebElement yourname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
	yourname.sendKeys("Prithika");
	WebElement youremail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
	youremail.sendKeys("Prithika@gmail.com");
	WebElement gifttheme= driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
	gifttheme.click();
	
	WebElement msg= driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
	msg.sendKeys("Happy Birthday");
	
	WebElement amt= driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
	amt.sendKeys("1000");
//	WebElement birthday=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
//	birthday.click();
//	WebElement I_Understand=driver.findElement(By.xpath("//*[@id=\\\"input-theme-7\\\"]"));
//	I_Understand.click();
//	WebElement continue_btn=driver.findElement(By.xpath("//*[@id=\\\"input-theme-7\\\"]"));
//	continue_btn.click();
	
	WebElement terms= driver.findElement(By.xpath("//*[@name=\"agree\"]"));
	terms.click();
	WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
	 con.submit();
	
	
    }
}
