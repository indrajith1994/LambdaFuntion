package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import com.Base.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{
	
//	Base base;
	
	public WebDriver driver;

//	public LoginStepDefinition() {
//		PageFactory.initElements(driver, this);
//		base = new Base();
////		this.driver=Base.driver();
//		
//		
//	}

	@Before
	public void beforeScenario(){
		System.out.println("This will run before the Scenario base class");
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
	} 

	@After
	public void afterScenario(){
		driver.close();
		driver.quit();   
		System.out.println("This will run after the Scenario base class");

	}

	@Given("^User is already available in login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

	}


	@When("^title of the page is Free CRM$")
	public void title_of_login_page_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		//		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("indrajith.1994@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass1234wd");
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//form/div/div[normalize-space()='Login']")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		//		Assert.assertEquals("Cogmento CRM", title);
		driver.close();
		driver.quit();
	}

	@Given("^I want to write a step with \"([^\"]*)\" as userid$")
	public void i_want_to_write_a_step_with_as_userid(String arg1)  {
		System.out.println("User id is : "+ arg1);
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
	}

	@Then("^user enters \"([^\"]*)\" and password$")
	public void user_enters_and_password(String arg1)  {
		System.out.println("login User id is : "+ arg1);
		driver.findElement(By.name("email")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys("Pass1234wd");

	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_in_step(String arg1) {
		System.out.println("login status is  : "+ arg1);
	}

	@And("^Close the browser$")
	public void Close_the_browser() {
//		driver.close();
//		driver.quit();
	}
	
	
	@Given("^Web browser is at Guru demo login page$")
	public void web_browser_is_at_Guru_login_page() {
//		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/index.php");
	}

	@When("^Enter login credentials$")
	public void enter_login_credentials() {
//		driver.findElement(By.name("uid")).sendKeys("mngr287693");
		driver.findElement(By.name("uid")).sendKeys("mngr293940");
//		driver.findElement(By.name("password")).sendKeys("byhEhUz");
		driver.findElement(By.name("password")).sendKeys("EzezutU");
	}
	
	@And("^Click Login button$")
	public void click_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^Validate title of home page$")
	public void validate_title_of_home_page()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Guru99 Bank Home Page", title);
//		Assert.assertEquals("Guru99 Bank Manager HomePage", title);
//		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	}
	
	@And("^User reach to Add new customer page$")
	public void user_reach_to_Add_new_customer_page() throws InterruptedException  {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	}

	@When("^Enter new customer details$")
	public void enter_new_customer_details() throws InterruptedException  {
		System.out.println("Enter new customer details");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("NewUser");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("09051990");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Address for new user");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TN");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("890890");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("eqwqwer@test.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345qwert");
		Thread.sleep(1500);
	}

	@When("^Click submit$")
	public void click_submit() throws InterruptedException  {
		System.out.println("Click submit");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		Thread.sleep(5000);
	}

	@Then("^Validate new customer registered message$")
	public void validate_new_customer_registered_message()  {
		
		System.out.println("new_customer_registered_message_validation");
		if(driver.findElements(By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]")).size()>0) {
			System.out.println("New details added");
		}
		else
			System.out.println("New details not added");
	}
	
	
//	@When("I have {int} books here")
//    public void iHaveBooksHere(int arg0) {
//    }
//
//    @When("I have {int} book here")
//    public void iHaveBookHere(int arg0) {
//    }
////    @When("I have {int} books? here")
////    public void iHaveBookHerenew(int arg0) {
////    }
//
//    @When("^I have notes? here$")
//    public void iHaveNoteHere() {
//
//    }
	
	@When("^I have (\\d+) books? here$")
	public void i_have_book_here(int arg1)  {
	    
	   
	}

	@When("^I have note here$")
	public void i_have_note_here()  {
	    
	   
	}
//
//	@When("^I have (\\d+) books here$")
//	public void i_have_books_here(int arg1)  {
//	    
//	   
//	}

	@When("^I have notes here$")
	public void i_have_notes_here()  {
	    
	   
	}
	
	
}
