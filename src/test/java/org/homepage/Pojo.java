package org.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Baseclass {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"app\"]/div/section/section/header/div/div[3]/div/div/div[1]/div/span")
	private WebElement create;
	public WebElement getCreate() {
		return create;
	}
	
}
