package org.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;


	public static void launchbrowser() {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	public static void launchurl(String u) {
		// TODO Auto-generated method stub
	driver.get(u);
	}
	public static void maximizewindow() {
		// TODO Auto-generated method stub
	driver.manage().window().maximize();
	}
	public static void fillvalue(WebElement e,String s) {
		e.sendKeys(s);

	}
	
}
