package com.scandi.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class listCustomer {
	static WebDriver driver;
	
	@Given("user click the add customer")
	public void user_click_the_add_customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Scandinavian\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("given");
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click(); 
		driver.findElement(By.xpath("//label[text()='Done']")).click();	
	}

	@When("enter the valid address")
	public void enter_the_valid_address(DataTable data) {
		List<String>onedlist = data.asList(String.class);
		System.out.println(onedlist);
		driver.findElement(By.id("fname")).sendKeys(onedlist.get(0));
		driver.findElement(By.id("lname")).sendKeys(onedlist.get(1));

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(onedlist.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(onedlist.get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(onedlist.get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
	    
	}

	@When("user do some action")
	public void user_do_some_action(DataTable List) {
		
		List<String>onedlist1 = List.asList(String.class);
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

	@Then("user validate the outcomes")
	public void user_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	    System.out.println("Welcome to add customer tariff plan qerty is printed");
	}





}
