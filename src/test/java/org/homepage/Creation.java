package org.homepage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Creation extends Signin {
	
	
	@BeforeMethod()
	private void clickcreate() throws InterruptedException {
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[1]/div"));
		create.click();	
	}
	@Test(enabled=false)
		// NEWSLETTER CREATION
		// clicking create
	private void createnewsletter()throws InterruptedException, AWTException  {
		Thread.sleep(3000);
//		WebElement createbtn = driver.findElement(
//				By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[1]/div/span"));
//		createbtn.click();
//		Thread.sleep(1000);
		// clicking newsletter
		WebElement newsletter = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]"));
		newsletter.click();
		Thread.sleep(3000);
		// enter title
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/input"));
		title.sendKeys("currency");
		// wait time for text writing(manual)
		Thread.sleep(10000);
		WebElement publish = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[2]/button"));
		publish.click();
		Thread.sleep(3000);
		// enter tag
		WebElement tag = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/p[1]/input"));
		tag.sendKeys("wealth");
		// clicking upload banner image option
		WebElement banner = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[4]/span/div[1]/span/button"));
		banner.click();
		// wait time for banner image selection(manual process)
		Thread.sleep(20000);
		// clicking submit button
		WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]"));
		submit.click();
	}
	@Test(enabled=false)
		// NOTES CREATION
		
	private void createnotes()throws InterruptedException, AWTException  {
		Thread.sleep(3000);
	//	WebElement create = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[1]/div/span"));
	//	create.click();
		Thread.sleep(2000);
		WebElement notes = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[2]"));
		notes.click();
		Thread.sleep(10000);
		WebElement publish = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[3]/button"));
		publish.click();
	}
	@Test(enabled=false)
	// CHANNEL CREATION
	private void createchannel() throws InterruptedException {
		Thread.sleep(1000);
		WebElement channel = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[3]"));
		channel.click();
		//click image upload
		Thread.sleep(1000);
		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[1]/div[2]/span/div/div/span"));
		image.click();
		// wait time for uploading image(manual process)
		Thread.sleep(20000);
		//channel name
		WebElement channelname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[1]/div[3]/div/div/input"));
		channelname.sendKeys("SJ talks");
		//channel description
		WebElement description = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[1]/div[4]/div/div/div/textarea"));
		description.sendKeys("hgkjhkgjhdiytoyertiuyncbvmnbxcmsjlksjld");
		//public or private
		WebElement publicbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[2]/div[2]/div/label[2]"));
		publicbtn.click();
		//channel category
		WebElement category = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[2]/div[4]/div/label[1]/span[2]/div/div/img"));
		category.click();
		//channel create
		WebElement createbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[3]/div[2]/button"));
		createbtn.click();

	}
	@Test(enabled=false)
	// POST CREATION
	private void post() {
		WebElement post = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[4]"));
		post.click();
		WebElement title = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/input"));
		title.sendKeys("g");
		WebElement description = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/textarea"));
		description.sendKeys("jdjfhkjsdfhlkdsfjlksjflskdj");
		WebElement postbtn = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[4]/div/div[2]/button"));
		postbtn.click();
		

	}
	@Test(enabled=false)
	// POLL CREATION
	private void poll() throws InterruptedException {
		WebElement poll = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]"));
		poll.click();
		Thread.sleep(1000);
		WebElement question = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[3]/div/textarea"));
		question.sendKeys("with passive investment, the investor can avoid losses");
		WebElement answer1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div/input"));
		answer1.sendKeys("false");
		WebElement answer2 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[4]/div[1]/div[2]/div/div/input"));
		answer2.sendKeys("true");
		WebElement dd = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[4]/div[2]/div/div[1]/input"));
		dd.sendKeys("06");
		WebElement hh = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[4]/div[2]/div/div[2]/input"));
		hh.sendKeys("00");
		WebElement mm = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[4]/div[2]/div/div[3]/input"));
		mm.sendKeys("00");
		WebElement tag = driver.findElement(By.xpath("//*[@id=\"rc_select_0\"]"));
		tag.sendKeys("investment");
		WebElement createpoll = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[5]/div/div[3]/button"));
		createpoll.click();

	}
	@Test(priority=6)
	//EVENT CREATION
	private void event() throws InterruptedException {
		Thread.sleep(1000);
		WebElement event = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[6]"));
		event.click();
		WebElement digital = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div[3]/div/div/div[1]/label"));
		digital.click();
		WebElement continuebtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div[4]/button"));
		continuebtn.click();
		WebElement session = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[1]/div/div/label[2]"));
		session.click();
		WebElement agegroup = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[2]/div[1]/div/div/span[2]"));
		agegroup.click();
		WebElement language = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[2]/div[2]/div/div/span[2]"));
		language.click();
		WebElement datebtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[3]/div/div/div[1]/div/div/input"));
		datebtn.click();
		WebElement startdate = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[6]/div"));
		startdate.click();
		Thread.sleep(1000);
		WebElement starttime = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[1]/div[2]/div[2]/ul[1]/li[13]/div"));
		starttime.click();
		Thread.sleep(3000);
		WebElement okbtn = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/ul/li[2]/button"));
		okbtn.click();
		WebElement timebtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[3]/div/div/div[2]/div/div/input"));
		timebtn.click();
		WebElement enddate = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[6]/div"));
		enddate.click();
		Thread.sleep(1000);
		WebElement endtime = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/div[2]/div[2]/ul[1]/li[18]/div"));
		endtime.click();
		Thread.sleep(3000);
		WebElement okbtn2 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/ul/li[2]/button"));
		okbtn2.click();
		WebElement eventname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[5]/div[1]/input"));
		eventname.sendKeys("finance management");
		WebElement description = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[6]/div/div/textarea"));
		description.sendKeys("session is about investment,planning,savings,etc..,");
		WebElement next = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[7]/div/div/div[2]/button"));
		next.click();
		WebElement bannerimage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[2]/div/span/div/span"));
		bannerimage.click();
		Thread.sleep(15000);
	//	WebElement channel = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[3]/div[1]/div/div"));
	//	channel.click();
	//	channel.sendKeys(Keys.ENTER);
		
		WebElement titleimage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[3]/div[2]/span/div/span"));
		titleimage.click();
		Thread.sleep(10000);
		WebElement createbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div[4]/div[2]/button[2]"));
		createbtn.click();
		Thread.sleep(10000);
		WebElement joinbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div[2]/div/div[2]/div/div[2]/p[2]/div/div[1]/a/button"));
		joinbtn.click();
		Thread.sleep(5000);
		WebElement livebtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div[2]/button"));
		livebtn.click();
	}
		
	


	}
