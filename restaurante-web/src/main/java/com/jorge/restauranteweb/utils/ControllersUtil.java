package com.jorge.restauranteweb.utils;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class ControllersUtil {
	
	public static void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		String contextPath = ec.getRequestContextPath();
		// ec.redirect(contextPat + pagina);
		ec.redirect(contextPath.concat(pagina));
	}
	
	public static void mostrarMensaje(Severity severity, String titulo, String mensaje) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, titulo, mensaje));
	}
}
