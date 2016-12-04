package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{
	
	@FindBy(id="Email")
	private WebElement userName;
    
    @FindBy(id="Passwd")
    private WebElement password;
    
    @FindBy(id="next")
    private WebElement nextButton;
    
    @FindBy(id="signIn")
    private WebElement signInButton;
    public void clickNext(){
    	nextButton.click();
    }
    
    public void signIn(){
    	signInButton.click();
    }
    
   
    public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	
}
