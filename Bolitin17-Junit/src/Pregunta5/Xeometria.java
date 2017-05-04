package Pregunta5;

import java.util.Scanner;

public class Xeometria {
	
		
	
	public int perimetroCadrado(int lado){ 
		lado =2;
		System.out.println("Perimetro Cuadrado: " + lado*4);
		return lado;
	}	
	
		
	public int areaCadrado(int lado) {
		lado =2;
		System.out.println("Area Cadrado: " + lado*lado);
		return lado;
	}
	public double teoremaPitagoras(int catetoA, int catetoB) {
		double hipotenusaC;
		
		System.out.println("teorema de pitágoras ");
		return hipotenusaC= Math.sqrt((catetoA*catetoA) + (catetoB*catetoB));
		 
	}
	
}
