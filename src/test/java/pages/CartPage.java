package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

	public String cartPageUrl = "https://www.wafilife.com/shop/books/medi-english-for-medical-and-admission-test/";
	public By bookOrder = By.xpath("//button[text()='অর্ডার করুন']");
	public By completeOrder = By.xpath("//div[@id='proceed_to_checkout']/a[2]");
	public By selectTagSelect = By.xpath("//select[@name='billing_state']"); 
	public By selectJela = By.xpath("//label[@for='billing_state']");
	public By selectArea = By.xpath("//label[@for='billing_area']");
	public By textAreaLarge = By.xpath("//textarea[@id='billing_address_1']");
	public By textAreaOthers = By.xpath("//textarea[@id='order_comments']");
	public By orderButton = By.xpath("//button[@id='place_order']");
	public By forScroll = By.xpath("//h3[contains(text(),'প্রয়োজনীয় লিংক')]");
	public By inputName = By.xpath("//input[@id='billing_first_name']");
	public By inputPhone = By.xpath("//input[@id='billing_phone']");
	public By inputAltPhone = By.xpath("//input[@id='billing_alternative_phone']");
	public By inputMail = By.xpath("//input[@id='billing_email']");
	public By inputDistrict = By.xpath("//p[@id='billing_state_field']");

}
