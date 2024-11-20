package testing;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.Action;
import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;

public class leetCode {
	
	
	@Test
	public void login(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://leetcode.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Signinbtn= driver.findElement(By.xpath("//*[@id=\"landing-page-app\"]/div/div[1]/div[3]/div[1]/div/div/div[2]/div/a[5]"));
		Signinbtn.click();
		
		WebElement Username= driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));
		Username.sendKeys("Admin");
		
		
		WebElement Pass= driver.findElement(By.xpath("//input[@autocomplete=\"password\"]"));
	     Pass.sendKeys("Samaksh");
		
		
		WebElement Sign= driver.findElement(By.cssSelector("span.btn-content__2V4r"));
		Sign.click();
		
		driver.close();
	}
	
	
	@Test
	public void drag(){
		
		WebDriver drivers = new ChromeDriver();
		drivers.get("https://www.ilovepdf.com/pdf_to_word");
		

		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a= Actions(drivers);
		
		WebElement	select = drivers.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		select.click();
		
	
		
	
		
		
		a.dragAndDrop(select, select)
		
		
		
		
	
	}


	private Actions Actions(WebDriver drivers) {
		// TODO Auto-generated method stub
		return null;
	}

}
