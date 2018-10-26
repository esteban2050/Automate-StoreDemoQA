package com.store.demoqa.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
public class homeStoreComponents {

	//Se mapean los target que pertenecen a la pagina principal.
	public static final Target SEARCH_BAR = Target.the("The search bar input").located(By.name("s"));
	public static final Target VALIDATION_TEXT = Target.the("my acount text in the home page").located(By.xpath("//*[@id=\"footer\"]/section[@class=\"footer_blog\"]/p"));
	public static final Target CART_ICON = Target.the("The car icon").
located(By.xpath("//*[@id=\"header_cart\"]/a"));
	
}
