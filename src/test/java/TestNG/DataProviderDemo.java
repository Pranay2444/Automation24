package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="dataSet")
	public void test(String username, String password)
	{
		System.out.println(username+ "===" +password);
	}
	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];
		dataset[0][0]="user1";
		dataset[0][1] ="pass1";
		
		dataset[1][0]="user2";
		dataset[1][1]="pass2";

		return dataset;
		
	}

}
