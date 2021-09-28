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
		
		  driver.get("https://www.gmail.com"); 
		  WebElement username=driver.findElement(By.id("identifierId")); 
		  WebElement password=driver.findElement(By.id("r1319639550415188")); 
		  WebElement login=driver.findElement(By.name("passwordNext"));
		  username.sendKeys("identifierId"); password.sendKeys("password");
		  login.click();
String actualUrl="//div[@id=':1t']";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
}
}


////span[text()='Next']//ancestor::button
