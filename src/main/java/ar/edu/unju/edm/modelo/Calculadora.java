package ar.edu.unju.edm.modelo;

public class Calculadora {
	double num1;
	double num2;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public double sumar() {
		double suma;
		suma = num1+num2;
		return suma;
	}
	
	public double restar() {
		double resta;
		resta = num1-num2;
		return resta;
	}
	
	public double multiplicar() {
		double producto;
		producto = num1*num2;
		return producto;
	}
	
	public double dividir() {
		double division=0;
		if(num2==0) {
			System.out.println("El divisor debe ser mayor a 0");
		}
		else {
			division=num1/num2;
		}
		return division;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(num1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(num2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (Double.doubleToLongBits(num1) != Double.doubleToLongBits(other.num1))
			return false;
		if (Double.doubleToLongBits(num2) != Double.doubleToLongBits(other.num2))
			return false;
		return true;
	}
	
	
}
