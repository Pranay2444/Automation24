package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice {

//	public static void main(String[] args) {
		WebDriver driver;
		@Test
		public void CheckTitle() {
			SoftAssert softassert = new SoftAssert();
			driver= new ChromeDriver();
			driver.get("https://www.ebay.com/");
			
			String ExptTitle= "Electronics, Cars, Fashion, Collectibles & more | ebay";
			
			String ActTitle=driver.getTitle();
			
			Assert.assertEquals(ExptTitle, ActTitle);
			driver.close();
			softassert.assertEquals(ExptTitle, ActTitle);
			softassert.assertAll();
			
			
			
		}
	}


