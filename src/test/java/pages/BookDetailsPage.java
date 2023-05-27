package pages;

import java.security.PublicKey;

import org.openqa.selenium.By;

public class BookDetailsPage extends BasePage{

	public By authorClick = By.xpath("//ul[@id='menu-main-menu-1']/li[5]/a");
	public By randomAuthor = By.xpath("//a[@class='author_name']");
	public By bookDetails = By.xpath("//div[@class='product_thumbnail_wrapper']/a");
			
}
