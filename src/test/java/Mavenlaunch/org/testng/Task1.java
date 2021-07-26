package Mavenlaunch.org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
	
	import org.testng.annotations.Test;



	
	public class Task1 extends BaseClass{
		
		
		
		@BeforeClass
		
		private void startingBrowser() {
			
			loadBrowser();
		
		}
		
		@Test(enabled = false)
		private void tc1() {
			
			launchUrl("https://www.facebook.com/");
			String title = driver.getTitle();
			
			Assert.assertTrue(title.contains("Facebook"), "check the title");
			
			WebElement txtmail = driver.findElement(By.id("email"));
			
			txtmail.sendKeys("Hari123");
			
//			String attribute = txtmail.getAttribute("value");
			
//			Assert.assertEquals("attribute", "Hari123","hari123");
			
			WebElement pass = driver.findElement(By.id("pass"));
			
			pass.sendKeys("Hari123");
			
			WebElement btnlog = driver.findElement(By.name("login"));
			
			btnlog.click();
		}
			
	   @Test
		   
		   private void tc2() {
			   
			   launchUrl("https://www.flipkart.com/account/login");
			   
			   maxwindow();
			   
			   LoginPojo l = new LoginPojo();
			   
			   l.getTxtEmail().sendKeys("Harimano43");
			   
			  String currentUrl = driver.getCurrentUrl();
			  
			  Assert.assertTrue(currentUrl.contains("flipkart"), "Check the URL");
			   
			   l.getTxtpass().sendKeys("Hari123"); 
					 
			
		}
	   
	  

	}

		   
		  
		  
			
			
			
			
			

		
		
		
		




