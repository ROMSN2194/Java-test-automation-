package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DraftPage extends Page {
	 @FindBy(how=How.XPATH,xpath="//a[contains(@title,'Чернетки')]")
	    private WebElement draftsLink;
	    
	    @FindBy(how=How.XPATH,xpath="//div[4]/div/div/table/tbody/tr/td[5]")
	    private WebElement firstDraft;
	    
	    @FindBy(how=How.XPATH,xpath="//div[text()='Надіслати']")
	    private WebElement sendButton;
	
	    public void firstDraftOpen(){
		firstDraft.click();
	    }
    
	    public String getDraftsLinkText(){
	    	return draftsLink.getText();
	    }
	
	    public void sendMessage(){
	    	sendButton.click();
	    }
	    
	    public void init(){
	    	
	    }
	    
	    public String getDraftsLink(){
	    	return draftsLink.getText();
	    }
}
