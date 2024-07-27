import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {
	@Test
	public void teste1_TextField() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:nome")).sendKeys("Davi");
		Assert.assertEquals("Davi", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Manoel");
		Assert.assertEquals("Manoel", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
		driver.quit();
	}
	@Test
	public void teste2_TextArea() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste básico no text-area");
		Assert.assertEquals("Teste básico no text-area", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.quit();	
	}
	@Test
	public void teste3_RadioButton() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();	
	}
	@Test
	public void teste3_CheckBox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:comidafavorita:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidafavorita:0")).isSelected());
		driver.quit();	
	}
}