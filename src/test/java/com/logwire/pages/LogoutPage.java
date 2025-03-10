// package com.logwire.pages;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import java.time.Duration;

// public class LogoutPage {

//     private WebDriver driver;
//     private WebDriverWait wait;
//     // locators
//     @FindBy(id = "react-burger-menu-btn")
//     private WebElement menuButton;
//     @FindBy(id = "logout_sidebar_link")
//     private WebElement logoutButton;

//     @FindBy(id = "login-button")
//     private WebElement loginButton;

//     public LogoutPage(WebDriver driver) {
//         this.driver = driver;
//         this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         PageFactory.initElements(driver, this);
//     }

//     // Actions

//     public void clickMenuButton() {
//         menuButton.click();
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));

//     }
//     public void clickLogoutButton() {
//         clickMenuButton();
//         logoutButton.click();
//     }
// }
