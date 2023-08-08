package testclass;
import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.ProjectMethods;


public class SampleTestclass extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="Sample E-Commerce Appliaction automation";
		testDescription="Automating Flipkart Application";
		testNodes="Base";
		category="Smoke";
		authors="Mymoon";
		browserName="chrome";
		dataSheetName="testdata";
	} 
	
	@Test
	public static void loginWithInvalidDetails() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();
		
		login
		.closeicon()
//		.Login()
		.enter_username();
		
			}

	@Test
	public static void loginWithValidDetails() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();
		
		login
		.closeicon()
		.enter_username();
		
			}
	@Test
	public static void SearchProduct() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();
			
		login
		.closeicon()
		.enter_username()
		.search()		
		.search_realmePhone();
	}
	@Test
	public static void checkCartwithoutLogin() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
		login
		.cart();
	}
	
	
	@Test
	public static void checkCartBeforeAddedProduct() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
	
		login
		.cart();
	}
	@Test
	public static void AddToCart() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
	
		login
		.cart();
	}
	@Test
	public static void checkCartAfterAddedProduct() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
	
		login
		.cart();
	}
	
}
