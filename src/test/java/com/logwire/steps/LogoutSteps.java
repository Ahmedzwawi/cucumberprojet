// package com.logwire.steps;

// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.time.Duration;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import com.logwire.pages.LogoutPage;
// import com.logwire.tools.WebdriverTool;

// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;

// public class LogoutSteps {
//     LogoutPage logooutPage;

//     @When("je clique sur le bouton logout {string}")
//     public void je_clique_sur_le_bouton_logout(String s) {
//         logooutPage = new LogoutPage(WebdriverTool.getDriver());
//         logooutPage.clickLogoutButton();
//     }

//     @Then("je suis redirigé à la page de connexion")
//     public void je_suis_redirig_au_Login() {
//     WebDriverWait wait = new WebDriverWait(WebdriverTool.getDriver(), Duration.ofSeconds(5));
//     // Attendre que le bouton login soit visible
//     WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//     assertTrue(loginButton.isDisplayed(), "Le bouton login n'est pas affiché après la déconnexion !");
//     }

    

// }
