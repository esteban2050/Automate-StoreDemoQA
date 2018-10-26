package com.store.demoqa.steptostep.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class afterTheSearch {
	//Se mapean el target que pertenece al boton de 'add product' para agregar el producto al carrito de compras.
	public static Target PRODUCT = Target.the("The products").locatedBy("//*[@id=\"grid_view_products_page_container\"]/div/div[{0}]/div[3]/form/div/div[1]/span/input");
}
