package com.store.demoqa.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.store.demoqa.steptostep.models.storeModel;
import com.store.demoqa.steptostep.userinterfaces.homeStoreComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
public class searchProduct implements Task{

	//Variable privada de tipo storeModel.
	private storeModel storemodel;
	
	//Constructor.
	public searchProduct (storeModel storemodel) {
		this.storemodel= storemodel;
	}
	
	@Override
	@Step("{0} fill the search bar with a product")	
	//metodo que lleva las interacciones 
	public <T extends Actor> void performAs(T actor) 
	{		
		//En estas interacciones, se hace clic en la barra del buscador de la pagina y se busca un
		//elemento que es enviado por parametro desde el step Definitions y se manda con su propiedad get.
		actor.attemptsTo(
		Enter.theValue(storemodel.getProduct()).into(homeStoreComponents.SEARCH_BAR).thenHit(Keys.ENTER));
	}
	
	public static Performable doTheSearch(storeModel storemodel) 
	{
		//El metodo instrumented recibe dos parametros, el primero es la clase a la cual hace referencia
		//y el segundo es el parametro que recibe el metodo que lo contiene
		return instrumented(searchProduct.class,storemodel);
	}
}
