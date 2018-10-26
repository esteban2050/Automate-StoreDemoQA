package com.store.demoqa.steptostep.questions;

import java.util.List;

import com.store.demoqa.steptostep.userinterfaces.homeStoreComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */

public class IsVisibleTheHomePage implements Question<List<String>>{

	//Metodo que retorna un texto como una lista de la pagina para valirdarlo luego.
	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(homeStoreComponents.VALIDATION_TEXT).viewedBy(actor).asList();
	}

	public static Question<List<String>> isVisible(){
		return new IsVisibleTheHomePage();
	}
}
