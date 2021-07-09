package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.selenium.Login;
import com.abc.selenium.Main;
import com.abc.selenium.Welcome;

public class MagentoTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickonMyAccount();
		Login l=new Login(driver);
		l.enterEmail();
		l.enterPass();
		l.clickOnLogin();
		
		Main m=new Main(driver);
		m.clickOnLogout();
		driver.close();
	}

}
