package Pregunta5;


import java.util.ArrayList;

public class DNI {
	private char[] dnilet = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public boolean eValido(String dni) {

		

		// compruebo su longitud que sea 9
		if (dni.length() == 9) {
			// Compruebo que los 8 primeros digitos sean numeros
			for (int i = 0; i < 8; i++) {
				if (Character.isDigit(dni.charAt(i))) {
					// compruebo que el 9º digito es una letra
					if (Character.isLetter(dni.charAt(8))) {
						return true;
					} else
						return false;
				} else
					return false;
			}
		} 
		else
			return false;
		return false;

	}

	public int calculaLetra(String dni) {
		int numero = Integer.parseInt(dni);
		int modulo = numero % 23;
		return modulo;
	}	

		
//non esta ben, hai que modificalo.
	 public boolean eValido(ArrayList<Integer>numeros, char letra){
		 if (numeros.size() == 8) {
				int modulo = calculaLetra(numeros);
				if (dnilet[modulo] == letra)
					return true;
				else
					return false;
			} else
				return false;
	}
	// }
	// public int calculaLetra(ArrayList<Integer>numeros) {

	// }

}
