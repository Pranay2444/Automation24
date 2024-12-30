package TestNG;

import org.testng.annotations.Test;
@Test(groups="user-registraion")
public class GroupingOfTCs {
	@Test(priority=1, groups="regression")
	public void Test1() {
		
		System.out.println("test1");
	}

	@Test(priority=2, groups="BVT")
	public void Test2() {
		System.out.println("test2");
	}
	@Test(priority=3, groups="regression+Smoke")
	public void Test3() {
		System.out.println("test3");
	}
	@Test(priority=1, groups="regression + UI")
	public void Test4() {
		System.out.println("test4");
	}
}
