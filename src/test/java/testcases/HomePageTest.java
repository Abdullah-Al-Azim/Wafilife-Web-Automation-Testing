package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.HomePage;
import utilities.BaseDriver;

public class HomePageTest extends BaseDriver{

	HomePage homepage = new HomePage();
	
	@Test(description = "Visit to wifilife.com")
	@Description("Visit to wafilife.com then wait for 3 seconds and take a screenshot")
	public void homePageTest() {
		getDriver().get(homepage.homePageUrl);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		homepage.takeScreenShot("Wafilife Home Page!!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
