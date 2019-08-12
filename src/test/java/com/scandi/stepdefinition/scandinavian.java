package com.scandi.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class scandinavian {
static WebDriver driver;
@Given("user able to launch the browser")
public void user_able_to_launch_the_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Scandinavian\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("given");
	driver.get("http://demo.guru99.com/telecom/");
	driver.findElement(By.xpath("//a[text()='Add Customer']")).click(); 
	driver.findElement(By.xpath("//label[text()='Done']")).click();	
}
@When("user click the addcustomer"){
driver.findElement(By.id("fname")).sendKeys("raveena");
driver.findElement(By.id("lname")).sendKeys("sutha");

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raveenakolanthaivel@gmail.com");
driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("chennai");
driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("12345678");
driver.findElement(By.xpath("//input[@type='submit']")).click();   
}
@When("user click the addcustomer")
public void user_click_the_addcustomer(io.cucumber.datatable.DataTable dataTable) {
	
	   
	    driver.findElement(By.id("fname")).sendKeys("raveena");
	    driver.findElement(By.id("lname")).sendKeys("sutha");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raveenakolanthaivel@gmail.com");
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("chennai");
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("12345678");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
    
}

@Then("I validate the outcomes")
public void user_able_to_find_the_customer_id() {
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}




}
