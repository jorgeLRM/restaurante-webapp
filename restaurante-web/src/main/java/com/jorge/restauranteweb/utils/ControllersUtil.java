package com.jorge.restauranteweb.utils;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class ControllersUtil {
	
	public static void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		String contextPath = ec.getRequestContextPath();
		// ec.redirect(contextPat + pagina);
		ec.redirect(contextPath.concat(pagina));
	}
}
