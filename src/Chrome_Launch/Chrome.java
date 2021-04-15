package Chrome_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
//		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AC102338\\Desktop\\Abhimanyu\\Notes\\Selenium_JAVA_Testing\\Selenium Training Files\\sOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");

	}

}
