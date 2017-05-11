package Pregunta5;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	/*private char[] dnilet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};*/
	
	
	public boolean eValido(String numeroLetra) {
		 boolean correcto = false;

		    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

		    Matcher matcher = pattern.matcher(numeroLetra);

		    if (matcher.matches()) {

		        String letra = matcher.group(2);

		        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		        int index = Integer.parseInt(matcher.group(1));

		        index = index % 23;

		        String reference = letras.substring(index, index + 1);



		        if (reference.equalsIgnoreCase(letra)) {

		            correcto = true;

		        } else {

		            correcto = false;

		        }

		    } else {

		        correcto = false;
		        

		    }

		    return correcto;

		}
	
public int calculaLetra(String dni) {
	String dnilet ="TRWAGMYFPDXBNJZSQVHLCKE";
	int modulo = dni % 23;
	char letra = dnilet.charAt(modulo);
	return letra;
	
}
		
	/*	public boolean eValido(ArrayList<Integer>numeros, char letra){
			
		}
		public int calculaLetra(ArrayList<Integer>numeros) {
			
		}*/	
	

}

