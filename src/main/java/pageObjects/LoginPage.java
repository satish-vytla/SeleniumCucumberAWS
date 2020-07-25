package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	 
	By email=By.id("mat-input-2");
	By password=By.id("password-field");
	By login=By.id("login-btn");

	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getEmail()
	{
		return driver.findElement(email);
//		 return driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	
	
}
