package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome 
{
	WebDriver driver;
	By myacct=By.linkText("My Account");
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonMyAccount()
	{
		driver.findElement(myacct).click();
	}
}
