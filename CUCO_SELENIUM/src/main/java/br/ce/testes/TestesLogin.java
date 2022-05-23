package br.ce.testes;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestesLogin {

	@Test
    public void Login() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		System.out.println(driver.getTitle()); 
		
        //Escrever no campo informando seu id html
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/p[1]/input")).sendKeys("jr13freitas@hotmail.com");

		driver.findElement(By.id("password")).sendKeys("12345678");
		
		driver.findElement(By.id("login-btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/app-root/app-top-menu/p-toolbar/div/div[2]")));

		//verificar a escrita no campo pelo seu id
		Assert.assertEquals("Seja bem vindo, Junior Freitas!", driver.findElement(By.xpath("/html/body/app-root/app-top-menu/p-toolbar/div/div[2]")).getText());
		
		driver.quit();

	}
	
	@Test
    public void LoginInvalido() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		System.out.println(driver.getTitle()); 
		
        //Escrever no campo informando seu id html
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/p[1]/input")).sendKeys("jr13freitas@hotmail.com4");
		
		driver.findElement(By.id("password")).sendKeys("12345678855");
		
		driver.findElement(By.id("login-btn")).click();

		//verificar a escrita no campo pelo seu id
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("user-incorreto")));
		
		//verificar a escrita no campo pelo seu id
		Assert.assertEquals("Usuário e/ou senha incorretos!", driver.findElement(By.id("user-incorreto")).getText());
		
		driver.quit();

	}
	

}
