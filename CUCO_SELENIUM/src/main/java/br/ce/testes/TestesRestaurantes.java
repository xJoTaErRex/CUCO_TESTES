package br.ce.testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestesRestaurantes {
	@Test
    public void SolicitarParceiraOng() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		System.out.println(driver.getTitle()); 
		
        //Escrever no campo informando seu id html
		driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/p[1]/input")).sendKeys("userdeteste@mail.com");

		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.id("login-btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("menu-btn")));
		
		driver.findElement(By.id("menu-btn")).click();
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"undefined_header\"]/span[2]")));
		
		driver.findElement(By.xpath("//*[@id=\\\"undefined_header\\\"]/span[2]")).click();
		
		driver.quit();

	}
}
