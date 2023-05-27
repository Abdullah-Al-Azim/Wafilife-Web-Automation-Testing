package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

import pages.BookDetailsPage;
import pages.CartPage;
import pages.HomePage;
import utilities.BaseDriver;

@Test
public class CartPageTest extends BaseDriver{
	HomePage homepage = new HomePage();
	BookDetailsPage bookdetailsage = new BookDetailsPage();
	CartPage cartPage = new CartPage(); 
	
	public void cartPageTest() throws InterruptedException {
		getDriver().get(cartPage.cartPageUrl);
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.bookOrder);
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.completeOrder);
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.inputName);
		cartPage.writeText(cartPage.inputName, "Azim");
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.inputPhone);
		cartPage.writeText(cartPage.inputPhone, "010101010");
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.inputAltPhone);
		cartPage.writeText(cartPage.inputAltPhone, "55555555");
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.inputMail);
		cartPage.writeText(cartPage.inputMail, "azim@gmail.com");
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.inputDistrict);
		Thread.sleep(1000);
		WebElement district = getDriver().findElement(By.xpath("//select[@name='billing_state']"));
		Select selectDisctrict = new Select(district);
		selectDisctrict.selectByValue("BD-01");
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.selectJela);
		Thread.sleep(3000);
		WebElement area = getDriver().findElement(By.xpath("//select[@name='billing_area']"));
		Select selectArea = new Select(area);
		selectArea.selectByIndex(2);
		Thread.sleep(1000);
		cartPage.clickOnElement(cartPage.selectArea);
		Thread.sleep(1000);
		
		cartPage.clickOnElement(cartPage.textAreaLarge);
		Thread.sleep(1000);
		cartPage.writeText(cartPage.textAreaLarge, "I have no address");
		Thread.sleep(1000);
		
		cartPage.clickOnElement(cartPage.textAreaOthers);
		Thread.sleep(1000);
		cartPage.writeText(cartPage.textAreaOthers, "I have no OTHERS address also!");
		Thread.sleep(2000);
		
		cartPage.scrollHandling(cartPage.forScroll);
		Thread.sleep(2000);
		
		cartPage.highlightElement(cartPage.orderButton);
		Thread.sleep(2000);
		cartPage.clickOnElement(cartPage.orderButton);
		Thread.sleep(1000);
	}
}
