package com.company.paquete3;

import com.company.paquete2.IVACalculadora;

public class GenericCalculator {

	
	public double calculateFinalPrice(double price){
		double iva = IVACalculadora.calculateIVA(price);
		return price + iva;
	}
}
