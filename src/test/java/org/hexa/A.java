package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayanthan\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://maven.apache.org/download.cgi");
		
	}

}
