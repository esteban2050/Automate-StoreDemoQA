package com.store.demoqa.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.store.demoqa.steptostep.questions.IsVisibleTheHomePage;
import com.store.demoqa.steptostep.exeptions.NoInternetConection;
import static org.hamcrest.CoreMatchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
public class OpenBrowser implements Task{
	
	//Variable privada de tipo PageObject
	private PageObject page;
	
	//Constructor. Se le da valor al page que se creo con el parametro de entrada para mandarla por parametro
	//en las interacciones.
	public OpenBrowser(PageObject page) {
	this.page = page;	
	}
	
	@Override
	@Step("{0} opens the browser on Store demo QA")
	public <T extends Actor> void performAs(T actor) 
	{
		//En esta interaccion se indica que debe abrir el navegador en la pagina web q viene como parametro
		//desde el stepDefinitions.
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(IsVisibleTheHomePage.isVisible(), hasItem("Latest Blog Post:")).orComplainWith(NoInternetConection.class, 
				 getNoInternetConectionMessage()));
	}

	//Metodo que retorna el mensaje que indica que no hay internet
	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConection.NO_INTERNET_CONECTION_MESSAGE);
	}

	public static OpenBrowser on(PageObject page) {
		//la clase de la que se va hacer la instancia, en este caso, la misma clase OpenBrowser
		//y el parametro que recibe el metodo que lo contiene.
		return instrumented(OpenBrowser.class, page);
	}

}
