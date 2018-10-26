package com.store.demoqa.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.store.demoqa.steptostep.models.storeModel;
import com.store.demoqa.steptostep.userinterfaces.cartPageComponents;

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

public class ChangeTheQuantity implements Task{

	private storeModel storemodel;

	public ChangeTheQuantity (storeModel storemodel) {
		this.storemodel= storemodel;
	}
	
	@Override
	@Step("{0} change the quantity of the product")	
	//metodo que lleva las interacciones 
	public <T extends Actor> void performAs(T actor) 
	{		
		actor.attemptsTo(
		Enter.theValue(String.valueOf(storemodel.getQuantity())).into(cartPageComponents.QUANTITY_INPUT));
	}
	
	public static Performable increaseTheQuantity(storeModel storemodel) 
	{
		//El metodo instrumented recibe dos parametros, el primero es la clase a la cual hace referencia
		//y el segundo es el parametro que recibe el metodo que lo contiene
		return instrumented(ChangeTheQuantity.class,storemodel);
	}
}
