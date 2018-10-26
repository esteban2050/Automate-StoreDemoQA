package com.store.demoqa.steptostep.exeptions;

public class NoInternetConection extends AssertionError{

	private static final long serialVersionUID=1L;

	//Mensaje que sera mostrado cuando el internet no este encendido.
	public static final String NO_INTERNET_CONECTION_MESSAGE = "No hay coneccion a internet";
	
	public NoInternetConection(String message, Throwable cause) {
		super(message, cause);
	}
}
