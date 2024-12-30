package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("Launching browser");
	}
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("Diconnect DB");
	}
	@Test
	public void Registraion() {
		System.out.println("Register the user");
	}
	
	@Test(priority=3)
	public void loginTest() {
		System.out.println("Login is successful");
	}
	@AfterTest
	public void alogoutTest() {
		System.out.println("Logout is succeeful");
	}
}
