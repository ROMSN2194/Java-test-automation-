package com.epam.tests;

import static org.testng.AssertJUnit.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.*;

public class GmailTest {
	String email="romanlebedovych21@gmail.com";
	String password="26051994";
	private UserAction user=new UserAction();
	
  
  
  @Test(priority=0)
  public void loginTest() {
	 
	 assertEquals("Gmail",user.getDriver().getTitle());
	 user.login(email, password);
	 	  }
  
  @Test(priority=1)
  public void  composeTest() throws InterruptedException{
	  int count=user.getDraftsCount();
	  System.out.println(count);
	  System.out.println(System.getenv("JAVA_HOME"));
	  user.compose("RomanLebedovych@gmail.com", "subject556","text");
	  user.openInDraft();
	  assertEquals(count+1,user.getDraftsCount());  
	  user.sendMessage();	  
	  
  }
  
}
