package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GroupSuitIn extends CommonDataSetup{
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");
	}

}
