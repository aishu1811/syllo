package org.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Header extends Signin{
	@Test(priority=1)
	//NOTIFICATIONS
	private void notifications() throws InterruptedException {
		Thread.sleep(2000);
		WebElement notification = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[2]/div[1]/span/button"));
		notification.click();

	}
	@Test(enabled=false)
	//MESSAGES
	private void messages() throws InterruptedException {
		Thread.sleep(1000);
	WebElement msg = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[2]/div[2]"));
	msg.click();
	Thread.sleep(1000);
	WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"rc_select_0\"]"));
	searchbtn.click();
	searchbtn.sendKeys("anitha");
	Thread.sleep(3000);
	WebElement msgbox = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input"));
	msgbox.sendKeys("hi");
	WebElement sendkey = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));
	sendkey.click();
	}

	@Test(priority=3)
	//PROFILE
	private void profile() throws InterruptedException {
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[2]/div[4]/span/span"));
		profile.click();
		Thread.sleep(2000);
		WebElement profilebtn = driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[2]"));
		profilebtn.click();
		Thread.sleep(3000);
		WebElement about = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-2\"]"));
		about.click();
		WebElement channels = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-3\"]"));
		channels.click();
		

	}
}
