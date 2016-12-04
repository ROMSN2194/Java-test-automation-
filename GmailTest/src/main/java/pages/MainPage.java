package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends Page{
	 @FindBy(how=How.XPATH,xpath="//div[contains(text(),'Õ¿œ»—¿“»')]")
	    private WebElement composeButton;
	    
	    @FindBy(how=How.XPATH,xpath="//textarea[@name='to']")
	    private WebElement to;
	    
	    @FindBy(how=How.XPATH,xpath="//input[@name='subjectbox']")
	    private WebElement subject;
	    
	    @FindBy(className="LW-avf")
	    private WebElement message;
	    
	    @FindBy(className="Ha")
	    private WebElement closeButton;
	    
	    public void clickCompose(){
	    	composeButton.click();
	    }
	    
	    public void setReceiver(String mailAddress){
			this.to.sendKeys(mailAddress);
		}

		public void setSubject(String subjectName){
			this.subject.sendKeys(subjectName);
		}
	    
		public void setMessage(String text){
			this.message.sendKeys(text);
		}
		
		public void closeComposeWindow(){
			closeButton.click();
		}


}
