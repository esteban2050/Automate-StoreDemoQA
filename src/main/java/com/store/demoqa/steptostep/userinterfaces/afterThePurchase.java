package com.store.demoqa.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class afterThePurchase {

	//Se mapean los target que pertenecen al nombre del producto en la pagina principal y en la compra.
	public static final Target TEXT_FROM_HOMEPAGE = Target.the("The text from de homepage").located(By.name("quantity"));
	public static final Target TEXT_FROM_THE_LIST_OF_THE_PURCHARSE = Target.the("The text from the list of the purcharse").located(By.name("quantity"));
}
