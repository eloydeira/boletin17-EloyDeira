package Exercicios;

import java.util.Scanner;

public class Xeometria {
	
		
	
	public int perimetroCadrado(int lado){ 
		
		System.out.println("Perimetro Cuadrado: " + lado*4);
		return lado;
	}	
	
		
	public int areaCadrado(int lado) {
		
		System.out.println("Area Cadrado: " + lado*lado);
		return lado;
	}
	public double teoremaPitagoras(int catetoA, int catetoB) {
		double hipotenusaC;
		
		
		System.out.println("Teorema de pitágoras: " + (hipotenusaC=(catetoA*catetoA)+(catetoB*catetoB)) );
		return hipotenusaC= Math.sqrt((catetoA*catetoA) + (catetoB*catetoB));
		 
	}
	public double teoremaPitagoras2(double hipotenusa, double catetoA){
		double catetoB;
		
		System.out.println("Teorema de pitágoras: " + (catetoB=(hipotenusa*hipotenusa)-(catetoA*catetoA)));
		return catetoB=Math.sqrt(catetoB=(hipotenusa*hipotenusa)-(catetoA*catetoA));
	}
	
}
