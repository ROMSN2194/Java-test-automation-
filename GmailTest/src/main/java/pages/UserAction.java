package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UserAction {
	
	LoginPage loginpage;
	MainPage main;
	DraftPage drafts;
	WebDriver driver;
	String appUrl="https://mail.google.com";
	public UserAction(){
		    System.setProperty("webdriver.chrome.driver", "\\TAlab\\lib\\chromedriver_win32\\chromedriver.exe"); 
		    driver = new ChromeDriver();
		    driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			driver.manage().window().maximize(); 
		    loginpage=new LoginPage();
		    main=new MainPage();
		    drafts=new DraftPage();
		    loginpage.init(driver);
		    main.init(driver);
		    drafts.init(driver);
				    

	}
	
	public  WebDriver getDriver(){
		return this.driver;
	}
	public void login(String userName,String password){
		
		loginpage.setUserName(userName);
		loginpage.clickNext();
		loginpage.setPassword(password);
		loginpage.signIn();
	}
	
	public void compose(String recipient,String subject,String text){
		main.clickCompose();
		main.setReceiver(recipient);
		main.setSubject(subject);
		main.setMessage(text);
		main.closeComposeWindow();
	}
	
	public void openInDraft(){
		driver.navigate().to("https://mail.google.com/mail/#drafts");
		drafts.firstDraftOpen();
		
	}
	
	public void sendMessage(){
		
		drafts.sendMessage();
	}
	public int getDraftsCount(){
		return Integer.parseInt(drafts.getDraftsLinkText().substring(drafts.getDraftsLinkText().indexOf("(")+1,drafts.getDraftsLinkText().indexOf(")")));
	}
}
