package br.ce.testes;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestesCadastros {
	
	@Test
    public void CadastroUsuarioOng() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		System.out.println(driver.getTitle()); 
		
        //Escrever no campo informando seu id html
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/p[4]/a")).click();
				
		WebElement element = driver.findElement(By.id("tipoConta"));
		
		Select combo = new Select(element);
		
		combo.selectByVisibleText("ONG");
		
		driver.findElement(By.id("user")).sendKeys("userdeteste@mail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirm_password-password")).sendKeys("123456");
		driver.findElement(By.id("nome")).sendKeys("user de teste");
		driver.findElement(By.id("cpf")).sendKeys("46586964157222");
		driver.findElement(By.id("estabelecimento")).sendKeys("Ong de Teste");
		driver.findElement(By.id("cidade")).sendKeys("SP");
		driver.findElement(By.id("estado")).sendKeys("SP");
		driver.findElement(By.id("endereco")).sendKeys("rua dos bobos numero 0");
		driver.findElement(By.id("email")).sendKeys("ongdeteste@mail.com");
		driver.findElement(By.id("contato")).sendKeys("551198523648");
		
		
		//driver.findElement(By.xpath("//*[@id=\"registrar-btn\"]/button")).click();
		
		driver.quit();
		
	}
	
	@Test
    public void CadastroUsuarioRestauranteComCNPJInvalido() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		System.out.println(driver.getTitle()); 
		
        //Escrever no campo informando seu id html
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/p[4]/a")).click();
				
		WebElement element = driver.findElement(By.id("tipoConta"));
		
		Select combo = new Select(element);
		
		combo.selectByVisibleText("Restaurante");
		
		driver.findElement(By.id("user")).sendKeys("userdeteste@mail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirm_password-password")).sendKeys("123456");
		driver.findElement(By.id("nome")).sendKeys("user de teste");
		driver.findElement(By.id("cpf")).sendKeys("465869641572");
		driver.findElement(By.id("estabelecimento")).sendKeys("Restaurante de Teste");
		driver.findElement(By.id("cidade")).sendKeys("SP");
		driver.findElement(By.id("endereco")).sendKeys("rua dos bobos numero 530");
		driver.findElement(By.id("email")).sendKeys("Restaurantedeteste@mail.com");
		driver.findElement(By.id("contato")).sendKeys("551198523648");
		//driver.findElement(By.id("registrar-btn")).click();
		
		driver.quit();
		
	}

}
