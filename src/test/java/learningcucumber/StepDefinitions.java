package learningcucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    WebDriver driver;

    @Before
    public void launch() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        // Consider using explicit waits instead of implicit wait
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("user is login to page")
    public void user_is_login_to_page() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
    }

    @When("user enters a valid username")
    public void user_enters_a_valid_username() {
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
    }

    @When("user enters a valid password")
    public void user_enters_a_valid_password() {
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("user navigates to the dashboard page")
    public void user_navigates_to_the_dashboard_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "login failed");
    }

    @After
    public void quit() {
        driver.quit();
    }
}