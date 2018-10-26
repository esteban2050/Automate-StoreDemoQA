package com.store.demoqa.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class cartPageComponents {
	
	//Se mapean el target que pertenecen a cantidad del producto en la ventana del carro de compras.
	public static final Target QUANTITY_INPUT = Target.the("The quantity input for the product").located(By.name("quantity"));	

}
