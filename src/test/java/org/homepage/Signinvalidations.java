package org.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Signinvalidations extends Baseclass {
	@AfterMethod
	private void quit() {
		driver.close();

	}
	@Test(enabled=false)
	//"A. Signin(without adding business profile and preferences for creator)"
	private void m1() throws InterruptedException {
		launchbrowser();
		launchurl("https://beta.syllo.co/dashboard");
		maximizewindow();
		// SIGN IN FUNCTIONALITY
		// email
		WebElement emailbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		emailbtn.sendKeys("anusha567@gmail.com");
		// password
		WebElement pswdbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/span/input"));
		pswdbtn.sendKeys("anusha@567");
	
		// sign in btn
		WebElement signinbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signinbtn.click();
		Thread.sleep(1000);
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/form/div[5]/button"));
		signup.click();
		Thread.sleep(1000);
		WebElement nextbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/button"));
		nextbtn.click();
	}
	@Test(enabled=false)
//	"B. Signin (Adding business profile and user preferences in creator account)"
	private void m2() throws InterruptedException {
		launchbrowser();
		launchurl("https://beta.syllo.co/dashboard");
		maximizewindow();
		// SIGN IN FUNCTIONALITY
		// email
		WebElement emailbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		emailbtn.sendKeys("anusha567@gmail.com");
		// password
		WebElement pswdbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/span/input"));
		pswdbtn.sendKeys("anusha@567");
	
		// sign in btn
		WebElement signinbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signinbtn.click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/form/div[2]/input"));
		name.sendKeys("shine");
		WebElement tag = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/form/div[3]/div/div/div"));
		tag.sendKeys("finance");
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/form/div[5]/button"));
		signup.click();
		Thread.sleep(1000);
		WebElement area = driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-1\"]/div/div/div/label[4]"));
		area.click();
		WebElement nextbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/button"));
		nextbtn.click();

	}
	@Test(priority=3)
	//"C. Signin (Learner account)-No create option in dashboard"
	private void m3() throws InterruptedException {
		launchbrowser();
		launchurl("https://beta.syllo.co/dashboard");
		maximizewindow();
		// SIGN IN FUNCTIONALITY
		// email
		WebElement emailbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		emailbtn.sendKeys("neetu78@gmail.com");
		// password
		WebElement pswdbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/span/input"));
		pswdbtn.sendKeys("neetugk@78");
	
		// sign in btn
		WebElement signinbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signinbtn.click();
		Thread.sleep(5000);

	}
}
