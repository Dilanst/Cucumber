package com.cafeto.challenge.po;


import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cafeto.challenge.utils.Configuracion;
import com.cafeto.challenge.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * <pre>
 * Fecha      Autor     
 * 27-01-2020 Juan Sebastian Zapata Maya	
 * </pre>
 * 
 * <p>Page Object que permite interacturar con los componentes de la 
 * pantalla de inicio de AWS
 * </p>
 * 
 * @author Juan Sebastian Zapata Maya
 * @version 1.0
 * @category View
 * **/
public class HomeView {

	@FindBy(css="[data-lb-popover-trigger=popover-my-account]")
	private WebElement btnMenu;


	public HomeView() {
		Configuracion.iniciarConfiguracion();
		PageFactory.initElements(Configuracion.driver, this);
	}


	@Given("into to the webside http:\\/\\/aws.amazon.com\\/en\\/")
	public void into_to_the_webside_http_aws_amazon_com_en() {


	}

	@When("into to the menu")
	public void into_to_the_menu() {
		btnMenu.click();
	}

	@When("into to the My account")
	public void into_to_the_My_account() throws InterruptedException {
		
		SeleniumUtils.esperarAnimacionElemento();

		
		SeleniumUtils.
		esperarElemento(
				"[data-id=popover-my-account] ul li:nth-child(2) a","css",10).click();

	}


	@Then("show me aws login")
	public void show_me_aws_login() {

			String assertSignIn =
					SeleniumUtils.
					esperarElemento(
							"signin_head","id",10).getText();
			
			
			assertFalse(assertSignIn.equalsIgnoreCase(""));
			
			Configuracion.driver.quit();

		}


	}
