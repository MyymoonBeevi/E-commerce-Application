package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeMethods;


public class LoginPage extends SeMethods{
	WebDriverWait wait = new WebDriverWait(driver, 40);
	public LoginPage closeicon() throws InterruptedException, AWTException
	{
//		/* startApp("Chrome",false); */
		WebElement signin = locateElement("xpath","//span[text()='Sign in']");
		
	if(signin.isDisplayed()) {
		click(signin);
	}
	else {
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        WebElement Login = locateElement("xpath","Login");
    	click(Login);
	}
		
				
		return this;
	}
	public LoginPage Login()
	{
	WebElement Login = locateElement("xpath","Login");
	click(Login);
		return this;
	}
	//a[text()='Login']
	public LoginPage enter_username() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//div[1]//input)[7]")));
		WebElement enterUsername1 = locateElement("xpath","(//form//div[1]//input)[7]");
		type_enter(enterUsername1,"6381592198");
	    return this;
	}
	
	public LoginPage search()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']")));
	WebElement search = locateElement("xpath","//input[@name='q']");
	type_enter(search, "Mobile");
		return this;
	}
	public LoginPage cart()
	{
	WebElement cart = locateElement("xpath","//*[text()='Cart']");
	click(cart);
		return this;
	}
	public LoginPage search_realmePhone()
	{
		
		WebElement search_realmePhone = locateElement("xpath","//div[text()= 'realme C53 (Champion Gold, 64 GB)']");
		click(search_realmePhone);
		switchToWindow( 1);
		return this;
	}
	
	
	
	

}
