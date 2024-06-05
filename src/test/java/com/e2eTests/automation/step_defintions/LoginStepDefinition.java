package com.e2eTests.automation.step_defintions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;

	public LoginStepDefinition() {

		loginPage = new LoginPage();
	}

	@Given("Je visite le site nopcommerce")
	public void jeVisiteLeSiteNopcommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().sendKeys(email);

	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		LoginPage.getPassword().sendKeys(password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String titlePage = LoginPage.getTitlePage().getText();
		Assert.assertEquals(titlePage, text);
	}
}
