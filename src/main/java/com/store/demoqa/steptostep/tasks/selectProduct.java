package com.store.demoqa.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.store.demoqa.steptostep.models.storeModel;
import com.store.demoqa.steptostep.userinterfaces.afterTheSearch;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class selectProduct implements Task {

	//Variable privada de tipo storeModel.
	private storeModel storemodel;
	
	//variable publica que es usada para asignarle valor en el constructor.
	public static String product;

	//Constructor.
	public selectProduct (storeModel storemodel) {
		this.storemodel= storemodel;
	}
	
	@Override
	@Step("{0} select add the product")	
	//metodo que lleva las interacciones 
	public <T extends Actor> void performAs(T actor) 
	{		
		//En estas acciones selecciono el elemento en la lista de la pagina con el parametro que le envio desde 
		//el step definitions y hago clic en el boton para agregarlo  al carrito de compras.
		product=Text.of(afterTheSearch.PRODUCT.of(storemodel.getNumberInTheList())).viewedBy(actor).asString();
		actor.attemptsTo(
		Click.on(afterTheSearch.PRODUCT.of(storemodel.getNumberInTheList())));
	}
	
	public static Performable doTheSelect(storeModel storemodel) 
	{
		//El metodo instrumented recibe dos parametros, el primero es la clase a la cual hace referencia
		//y el segundo es el parametro que recibe el metodo que lo contiene
		return instrumented(selectProduct.class,storemodel);
	}
}
