package com.store.demoqa.steptostep.stepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.store.demoqa.steptostep.models.storeModel;
import com.store.demoqa.steptostep.questions.IsTheSameProduct;
import com.store.demoqa.steptostep.tasks.ChangeTheQuantity;
import com.store.demoqa.steptostep.tasks.OpenBrowser;
import com.store.demoqa.steptostep.tasks.searchProduct;
import com.store.demoqa.steptostep.tasks.selectProduct;
import com.store.demoqa.steptostep.userinterfaces.storeQAPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StoreDemoBuyProductStepDefinitions {
	
	@Managed(driver = "chrome"/*, clearCookies =ClearCookiesPolicy.BeforeEachTest*/)
	private WebDriver hisBrowser;
	
	//Se declara el actor  
	private Actor Esteban = Actor.named("Esteban");
	
	//Se instancia la clase que tiene el link de la pagina para enviarla como parametro.
	private storeQAPage storeqaPage;
	
	storeModel storemodel;
	
	@Before
	public void setUp() 
	{
		//En screenplay no se hace uso del driver directamente, sino del actor
		//por ello, el actor debe referenciar al driver
		Esteban.can(BrowseTheWeb.with(hisBrowser));		
	}
	
	//Se abre el navegador con la pagina que se le manda como parametro.
	@Given("^Esteban open the browser in the store demo QA$")
	public void estebanOpenTheBrowserInTheStoreDemoQA() {
		Esteban.wasAbleTo(OpenBrowser.on(storeqaPage));   
	    
	}

	//Se busca el producto que recibe como parametro en la barra de busquedad de la pagina.
	@When("^he search a product$")
	public void heSearchAProduct(List<storeModel> storemodel) {
		System.out.println(storemodel.get(0).getProduct());
	    Esteban.attemptsTo(searchProduct.doTheSearch(storemodel.get(0)));
	}

	//Se agrega el producto al carro de compras que es seleccionado de la lista por una posicion 
	//que recibe como parametro al azar.
	@When("^he add to car$")
	public void heAddToCar(List<storeModel> storemodel) {
		System.out.println("lkjdkanlelva"+storemodel.get(0).getNumberInTheList());
	  Esteban.attemptsTo(selectProduct.doTheSelect(storemodel.get(0)));	        
	}

	//Se hace un aumento al de la cantidad del producto con respecto al numero que recibe como parametro.
	@When("^he increase the product$")
	public void heIncreaseTheProduct(List<storeModel> Quantity) {	
		hisBrowser.findElement(By.xpath("//*[@id=\"header_cart\"]/a")).click();
		//Esteban.attemptsTo(GoToCar.on());	
		Esteban.attemptsTo(ChangeTheQuantity.increaseTheQuantity(Quantity.get(0)));
	}

	//Se valida el nombre del objeto seleccionado sea el mismo que hay en el carrito de compras. 
	@Then("^he will compare the element$")
	public void heWillCompareTheElement() {
		Esteban.should(seeThat(IsTheSameProduct.isTheSame(),Matchers.equalTo(selectProduct.product))); 
		}
}
