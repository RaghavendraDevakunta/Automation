package net.hello.one;

import org.junit.Test;
/**
 * Hello world!
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import junit.framework.Assert;

public class App {
@Test
public void login() {
//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	FirefoxDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
		
		  driver.get("https://www.browserstack.com/users/sign_in"); 
		  
		
		  WebElement
		  
		  username=driver.findElement(By.id("user_email_Login")); WebElement
		  password=driver.findElement(By.id("user_password")); WebElement
		  login=driver.findElement(By.name("commit"));
		  username.sendKeys("abc@gmail.com"); password.sendKeys("your_password");
		  login.click();
		 
String actualUrl="https://live.browserstack.com/dashboard";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
}
}


////span[text()='Next']//ancestor::button
