package cucumberscandi;

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

public class scandinaviiiiiii {
	static WebDriver driver;
	@Given("user able click the addcustomer")
	public void user_able_click_the_addcustomer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Scandinavian\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("given");
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click(); 
		driver.findElement(By.xpath("//label[text()='Done']")).click();	
	}

	@When("user able to fill the all the details")
	
	public void user_able_to_fill_the_all_the_details(DataTable details) {
		Map<String, String> sutha = details.asMap(String.class, String.class);
		
		driver.findElement(By.id("fname")).sendKeys(sutha.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(sutha.get("lname"));

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sutha.get("email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(sutha.get("address"));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(sutha.get("phno"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
	}

	@When("user click the validdetails")
	public void user_click_the_validdetails(DataTable cusdetails) {
	
		Map<String, String> ravii = cusdetails.asMap(String.class, String.class);
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

	@Then("user able to find the customer id")
	public void user_able_to_find_the_customer_id() {
	    Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	    System.out.println("Welcome to add customer tariff plan qerty is printed");
	}


}
