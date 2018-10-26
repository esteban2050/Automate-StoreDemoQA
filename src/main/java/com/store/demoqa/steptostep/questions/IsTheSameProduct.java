package com.store.demoqa.steptostep.questions;

import com.store.demoqa.steptostep.userinterfaces.afterThePurchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
public class IsTheSameProduct implements Question<String>{
	//En este metodo, se retorna el un texto de un elemento de la pagina web para luego compararlo.
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(afterThePurchase.TEXT_FROM_THE_LIST_OF_THE_PURCHARSE).viewedBy(actor).asString();
	}

	public static Question<String> isTheSame(){
		return new IsTheSameProduct();
	}

}
