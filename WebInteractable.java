package commonTest;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebInteractable {
static WebDriver driver;
	
	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\SonaliSession\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}else {
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	
	public static void  getUrl(String url) {
		 driver.get(url);
	}
	
	public static  String getCurrentUrl() {
		
		return driver.getCurrentUrl();
		
	}
	
	public static  String getPageSource() {
		return driver.getPageSource();
		
}
	
	public static  String getTitle() {
		return driver.getTitle();

}
	
	public static  String getWindowHandle() {
		return driver.getWindowHandle();

}
	
	public static  Set<String> getWindowHandles() {
		
		return driver.getWindowHandles();

}
	
	public static  void navigateBack() {
		driver.navigate().back();
		
	}
	
	public static  void navigateForward() {
		driver.navigate().forward();
		
	}
	

	public static  void navigateRefresh() {
		driver.navigate().refresh();
		
	}
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static WebElement findElement(String locatorType, String locatorValue) {
		WebElement element = null;
		switch (locatorType) {
		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;

		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;

		case "className":
			element = driver.findElement(By.className(locatorValue));
			break;

		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;

		case "tagName":
			element = driver.findElement(By.tagName(locatorValue));
			break;

		case "linkText":
			element = driver.findElement(By.linkText(locatorValue));
			break;

		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;

		case "cssSelector":
			element = driver.findElement(By.cssSelector(locatorValue));

		default:
			break;
		}
		return element;
	}

	public static void click(String locatorType, String locatorValue) {
		findElement(locatorType, locatorValue).click();
		System.out.println("Click On WebElement");

	}

	public static void submit(String locatorType, String locatorValue) {
		findElement(locatorType, locatorValue).submit();

	}

	public static void clear(String locatorType, String locatorValue) {
		findElement(locatorType, locatorValue).clear();

	}

	public static void sendKey(String locatorType, String locatorValue, String value) {
		findElement(locatorType, locatorValue).sendKeys(value);
		System.out.println("SendKyes Successfully");

	}
	
	public static void sendKeyboardKey(String locatorType, String locatorValue,Keys value) {
		findElement(locatorType, locatorValue).sendKeys(value);
		System.out.println("SendKyes Successfully");

	}
}


