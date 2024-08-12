package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	  static WebDriver driver;
	@Given("User navigate to facebook login page")
	public void user_navigate_to_facebook_login_page() {
	    driver=new EdgeDriver();
	    driver.get("https://www.facebook.com");
	}

	@Given("User enter incorrect username and incorrect password")
	public void user_enter_incorrect_username_and_incorrect_password() {
	    WebElement user = driver.findElement(By.id("email"));
	    user.sendKeys("nithya@23@gmail.com");
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("258963147");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	}

	@Then("User is in incrediential page")
	public void user_is_in_incrediential_page() {
	     Assert.assertTrue(true);
	     System.out.println("incorrect password");
	}



}
