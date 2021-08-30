package com.jorge.restaurantesdata.myexceptions;

import com.jorge.restaurantesdata.enums.CodigoEnum;

public class RestauranteException extends Exception {

	private int errorCode;
	
	public RestauranteException() {
		
	}
	
	public RestauranteException(String mensaje, CodigoEnum codigoEnum) {
		super(mensaje);
		this.errorCode = codigoEnum.getCode();
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
