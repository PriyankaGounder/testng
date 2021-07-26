package Mavenlaunch.org.testng;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPojo extends BaseClass{
		
		public LoginPojo() {
			
			PageFactory.initElements(driver, this);
			
			
				
		}
		
	    @FindBy(xpath="(//input[@type='text'])[2]")
	    
	    private WebElement txtEmail;
	    
	    @FindBy(xpath="//input[@type='password']")
	    
	    private WebElement txtpass;

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		
		}

