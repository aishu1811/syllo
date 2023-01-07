package org.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sideheader extends Signin{

	
	@Test(priority=1)
	//EXPLORE and MYHUB
	private void explore() throws InterruptedException {
		Thread.sleep(5000);
		WebElement explore = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/aside/div/ul/li[2]/span/a"));
		explore.click();
		WebElement myhub = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/aside/div/ul/li[3]"));
		myhub.click();
		WebElement channelbtn = driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-tab-0\"]"));
		channelbtn.click();
		Thread.sleep(2000);
		WebElement publicbtn = driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-0\"]/div[1]/div[1]/div/label[2]"));
		publicbtn.click();
	}
	@Test(priority=2)
	//BOOKMARK
	private void bookmark() {
		WebElement bookmark = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/aside/div/ul/li[4]"));
		bookmark.click();

	}

}
