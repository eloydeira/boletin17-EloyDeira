package Pregunta5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class DNI {
	private char[] dnilet = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E'};
	
	
	public boolean eValido(String numeroLetra) {//non esta ben, hai que modificalo
		
		String dni = null;
				
		
		//comprobar que a longitud sea 9
		if(dni.length() ==9) {
			return true;
		
				//comprobar que os 8 primeiros digitos sean numeros
				for(int i=0; i<8; i++){
					if(!Character.isDigit(dni.charAt(i))){
						return true;
					
						//comprobar que o 9º digito e unha letra
						if(!Character.isLetter(dni.charAt(8))){
							return true;
					}
					else 
						return false;
			}
					else 
						return false;
				}
		
			return false;
		
		
		}
	
public int calculaLetra(String numero) {//mal, volver mirar
	int modulo;

	if (numero.length() == 8) {
		for (int i = 0; i < 8; i++)
			if (numero.charAt(i) < '0' || numero.charAt(i) > '9')
				return -1;
	} else
		return -1;
	int numEntero = Integer.parseInt(numero);
	modulo = numEntero % 23;
return modulo;
}
		
	//	public boolean eValido(ArrayList<Integer>numeros, char letra){
			
		//}
		//public int calculaLetra(ArrayList<Integer>numeros) {
			
	//	}
	

}

