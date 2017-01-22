package com.epam.tests;

import static org.testng.AssertJUnit.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.*;

public class GmailTest {
	String email="romanlebedovych21@gmail.com";
	String password="26051994";
	private UserAction user=new UserAction();
	
  
  
  @Test(priority=0)
  public void loginTest() {
	  user.login(email, password);
	  assertEquals("Gmail",user.getDriver().getTitle());
  }
  
  @Test(priority=1)
  public void  composeTest() throws InterruptedException{
	  int count=user.getDraftsCount();
	 
	  user.compose("RomanLebedovych@gmail.com", "subject556","text");
	  user.openInDraft();
	  assertEquals(count+1,user.getDraftsCount());  
  }
}
