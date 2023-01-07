package org.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Withoutlogin extends Baseclass{
	@AfterMethod
	private void close() {
		driver.close();

	}
	@Test(enabled=false)
	//"A. using syllo without login"
	private void m1() throws InterruptedException  {
		launchbrowser();
		launchurl("https://beta.syllo.co");
		maximizewindow();
		WebElement filters = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div[2]/div/div/div/div[1]/div[3]/button"));
		filters.click();
		Thread.sleep(1000);
		WebElement watch = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-2\"]"));
		watch.click();
		Thread.sleep(1000);
		WebElement sylloevent = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div[3]/div/div[2]/div/label[2]/span[1]/input"));
		sylloevent.click();
	}
	@Test
	//"B. Entering login page when try to comment,follow or share"
	private void m2() throws InterruptedException {
		launchbrowser();
		launchurl("https://beta.syllo.co");
		maximizewindow();
		Thread.sleep(1000);
		WebElement explore = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/aside/div/ul/li[2]"));
		explore.click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div[1]/div/div/form/span/div[2]/div/div/div/div/input"));
		name.sendKeys("aish");
		Thread.sleep(4000);
		WebElement selectbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div[2]/div[2]/div/a/div/div[1]/div[2]/button"));
		selectbtn.click();
		Thread.sleep(2000);
		WebElement follow = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/button"));
		follow.click();
		Thread.sleep(2000);
		

	}
}
