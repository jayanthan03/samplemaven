package org.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelIntegrationMain extends ExcelIntegration{

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement username = driver.findElement(By.id("email"));
username.sendKeys(getData(1,0));
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys(getData(2,0));
String attribute = pass.getAttribute("value");
System.out.println(attribute);
driver.quit();
	}

}
