package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.modelo.Calculadora;

public class CalculadoraController {
	public void operaciones() {
		Calculadora calculadora1 = new Calculadora();
		calculadora1.setNum1(20);
		calculadora1.setNum2(10);
		
		double suma=calculadora1.getNum1()+calculadora1.getNum2();
		double resta=calculadora1.getNum1()-calculadora1.getNum2();
		double producto=calculadora1.getNum1()*calculadora1.getNum2();
		double division=calculadora1.getNum1()/calculadora1.getNum2();
		
		System.out.println("El resultado de la suma es: " +suma);
		System.out.println("El resultado de la resta es: " +resta);
		System.out.println("El resultado de la multiplicacion es: " +producto);
		System.out.println("El resultado de la division es: " +division);
	}

}
