package org.homepage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin extends Baseclass{
	@BeforeTest
	public void signin()throws InterruptedException, AWTException{
		launchbrowser();
		launchurl("https://beta.syllo.co/dashboard");
		maximizewindow();
		// SIGN IN FUNCTIONALITY
		// email
		WebElement emailbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[1]/input"));
		emailbtn.sendKeys("aish.v1811@gmail.com");
		// password
		WebElement pswdbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[2]/span/input"));
		pswdbtn.sendKeys("naaa@2021");
	
		// sign in btn
		WebElement signinbtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/form/div[3]/button"));
		signinbtn.click();
	}
	
}
