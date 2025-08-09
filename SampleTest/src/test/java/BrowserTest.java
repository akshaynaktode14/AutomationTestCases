import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		WebDriver driver = new ChromeDriver();
		 //System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\ChromeDriver");

		// WebDriver driver= new EdgeDriver();
		// System.setProperty("webdriver.edge.driver",projectPath+"\\drivers\\EdgeDriver");

		WebDriverManager.chromedriver().setup();

		//WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		// WebDriverManager.iedriver().setup();
		driver.get("https://demo.automationtesting.in/Index.html");
		
//		List<WebElement> InputElemnts= driver.findElements(By.xpath("//input"));
//		int count= InputElemnts.size();
//		System.out.println("size of input element: "+count);
		
		 driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		//searchFor.sendKeys("automation step by step");

		Thread.sleep(3000);
		driver.close();
	}

}
