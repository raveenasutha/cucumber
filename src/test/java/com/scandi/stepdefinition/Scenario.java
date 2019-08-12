package com.scandi.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Scenario {
	static WebDriver driver;
	@Given("user launch the url")
	public void user_launch_the_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Scandinavian\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("given");
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click(); 
		driver.findElement(By.xpath("//label[text()='Done']")).click();	
	    
	}

	@When("user give the valid details")
	public void user_give_the_valid_details(DataTable sutha) {
		Map<String,String>raveena=sutha.asMap(String.class,String.class);
		driver.findElement(By.id("fname")).sendKeys(raveena.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(raveena.get("lname"));

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(raveena.get("email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(raveena.get("address"));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(raveena.get("phno"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
	    
	    	}

	@When("user can find the customerID")
	public void user_can_find_the_customerID(DataTable s) {
		Map<String,String>ragavu=s.asMap(String.class,String.class);
		System.out.println("enter the customer id");
		WebElement txt = driver.findElement(By.tagName("h3"));
		String customerID= txt.getText();
        System.out.println(customerID);
driver.findElement(By.xpath("//a[text()='Home']")).click();
	driver.findElement(By.xpath("(//a[text()='Add Tariff Plan to Customer'])[1]")).click();
	WebElement cusID = driver.findElement(By.xpath("//input[@id='customer_id']"));
	cusID.sendKeys(customerID);
	driver.findElement(By.xpath("//input[@class='fit']")).click();
	
		
	   
	}

	@Then("user can validate the outcomes")
	public void user_can_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	    System.out.println("Welcome to add customer tariff plan qerty is printed");

}



}
