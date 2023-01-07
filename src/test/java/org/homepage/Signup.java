package org.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signup extends Baseclass{
	@BeforeMethod
	private void browser() {
		launchbrowser();
		launchurl("https://beta.syllo.co/dashboard");
		maximizewindow();

	}
	@AfterMethod
	private void browserclose() {
		driver.close();

	}
	@Test(enabled=false)
	private void signup() throws InterruptedException {
		
	WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/p/a"));
	signupbtn.click();
	WebElement fullname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
	fullname.sendKeys("deepthi");
	Thread.sleep(1000);
	WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/input"));
	username.sendKeys("deepthi21");
	WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/input"));
	email.sendKeys("deepthi21@gmail.com");
	WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[4]/span/input"));
	password.sendKeys("deepthi@213");
	WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[5]/span/input"));
	confirmpassword.sendKeys("deepthi@213");
	WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[6]/button"));
	submit.click();
	Thread.sleep(2000);

	}
	@Test(enabled=false)
	private void invalidusername() throws InterruptedException {
		WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/p/a"));
		signupbtn.click();
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		fullname.sendKeys("geetha");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/input"));
		username.sendKeys("g");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/input"));
		email.sendKeys("geetha234@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[4]/span/input"));
		password.sendKeys("geetha@234");
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[5]/span/input"));
		confirmpassword.sendKeys("geetha@234");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[6]/button"));
		submit.click();
//		WebElement creator = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/div/label[2]/span[1]"));
//		creator.click();
		WebElement learner = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/div/label[1]"));
		learner.click();
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signup.click();
		
	}
	@Test(enabled=false)
	private void usernamerepeat() throws InterruptedException {
		WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/p/a"));
		signupbtn.click();
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		fullname.sendKeys("geetha");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/input"));
		username.sendKeys("aishwarya");
		
	}
	@Test(priority=1)
	private void pswdmismatch() throws InterruptedException {
		WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/p/a"));
		signupbtn.click();
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		fullname.sendKeys("anusha");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/input"));
		username.sendKeys("anusha567");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/input"));
		email.sendKeys("anusha567@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[4]/span/input"));
		password.sendKeys("anusha@567");
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[5]/span/input"));
		confirmpassword.sendKeys("anusha@532");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[6]/button"));
		submit.click();
		Thread.sleep(2000);
	}
	@Test(enabled=false)
	private void signupsuccess() throws InterruptedException {
		WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/p/a"));
		signupbtn.click();
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		fullname.sendKeys("anusha");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/input"));
		username.sendKeys("anusha567");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/input"));
		email.sendKeys("anusha567@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[4]/span/input"));
		password.sendKeys("anusha@567");
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[5]/span/input"));
		confirmpassword.sendKeys("anusha@567");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[6]/button"));
		submit.click();
//		WebElement creator = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/div/label[2]/span[1]"));
//		creator.click();
//		WebElement learner = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/div/label[1]"));
//		learner.click();
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signup.click();
		System.out.println("signup successful");
	

	}
	

}
