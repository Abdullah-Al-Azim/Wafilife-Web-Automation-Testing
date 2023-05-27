package pages;

import static utilities.BaseDriver.getDriver;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Allure;

public class BasePage {

	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollHandling(By locator) {
		WebElement targetPagElementPage = getElement(locator);;
		Actions actions = new Actions(getDriver());
		
		actions.moveToElement(targetPagElementPage).perform();
	}
	
	public void hover(By element){
		Actions action = new Actions(getDriver());
		WebElement hoverOnSomething = getDriver().findElement((element));
		action.moveToElement(hoverOnSomething).perform();	
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	public void highlightElement(By loactor){
		WebElement highLightsElement = getElement(loactor);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript ("arguments[0].style.border='5px solid yellow'", highLightsElement);
		}
	
	
}
