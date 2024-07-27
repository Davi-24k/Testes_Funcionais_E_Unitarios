import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	@Test
	public void testeGoogle() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test
	public void testeSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Assert.assertEquals("Selenium", driver.getTitle());
		System.out.println(driver.getTitle());
		driver.quit();
	}
}