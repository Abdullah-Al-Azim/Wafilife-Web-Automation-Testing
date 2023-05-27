package testcases;

import org.testng.annotations.Test;

import pages.BookDetailsPage;
import pages.HomePage;
import utilities.BaseDriver;

@Test
public class BookDetailsTest extends BaseDriver{
	HomePage homepage = new HomePage();
	BookDetailsPage bookdetailsage = new BookDetailsPage();
	
	public void bookDetailsTest() {
		getDriver().get(homepage.homePageUrl);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		homepage.clickOnElement(bookdetailsage.authorClick);
		homepage.takeScreenShot("Author Page!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		homepage.clickOnElement(bookdetailsage.randomAuthor);
		homepage.takeScreenShot("Selected Author Page!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		homepage.clickOnElement(bookdetailsage.bookDetails);
		homepage.takeScreenShot("Book Details Page!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
