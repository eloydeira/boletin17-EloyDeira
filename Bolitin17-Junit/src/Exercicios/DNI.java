package Exercicios;


import java.util.ArrayList;

public class DNI {
	
	/**
	 * 
	 * @param dni: comprobamos que a lonxitude do dni sexa 9, despois comprobamos que o noveno caracter sexa unha letra.
	 * A continuacion comprobamos que os 8 primeiros digitos sexan numeros. E por ultimo verificamos que a letra sexa a correcta.
	 * @return un boolean que indica se o dni e valido.
	 */
	public boolean eValido(String dni) {
		// compruebo su longitud que sea 9
		if (dni.length() == 9) {
			
			// COMPRUEBO QUE EL NOVENO CARACTER SEA UNA LETRA.
			if(!Character.isLetter(dni.charAt(8))) {
				return false;
			}
						
			// Compruebo que los 8 primeros digitos sean numeros
			for (int i = 0; i < 8; i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					return false;
				}					
			}
			
			if(dni.charAt(8) != this.calculaLetra(Integer.parseInt(dni.substring(0,8)))) {
				System.out.println("A letra do DNI non é correcta");
				return false;
			} else {
				return true;
			}
			
		} 
		else {
			return false;
		}		
	}

	
	/**
	 * Metodo que devolve o modulo do número do DNI entre 23.
	 * @param dni: faise o modulo de 23
	 * @return a letra do dni
	 */
	public char calculaLetra(int dni) {
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
	    int modulo= dni % 23;
	    char letra = juegoCaracteres.charAt(modulo);
	    return letra; 
	}	
	
	/**
	 *  Método que devolve un o modulo do número do DNI entre 23.
	 * @param numeros: debe ser un arrayList de 8 elementos e os seus elementos deben ser números enteros entre 0 e 9.
	 * @return a letra do dni.
	 */
	public char calculaLetraArrayList(ArrayList<Integer>numeros) {
		 String numeroEnCadena = "";
		 String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		
			 for(int i = 0; i < numeros.size(); i++) {				 
				 numeroEnCadena += Integer.toString(numeros.get(i));
			 }
				 
			 int modulo= Integer.parseInt(numeroEnCadena) % 23;
				   
			 char letra = juegoCaracteres.charAt(modulo);
			    return letra; 
		
	}

		
	/**
	 * Método que devolve un booleano que indica si un DNI é valido.
	 * @param numeros: Debe ser sempre un arrayList de enteiros
	 * @param letra: Debe ser sempre unha cadea de lonxitude 1.
	 * @return boolean indicando si o dni é válido ou non.
	 */
	 public boolean eValidoArrayList(ArrayList<Integer>numeros, char letra){		 		 		 
		 if (numeros.size() == 8) {
			 for(int i = 0; i < 8; i++) {				 
				 if(numeros.get(i) < 0 || numeros.get(i) > 9) {
					  return false;
				 }
			 }			 
			 if(this.calculaLetraArrayList(numeros) == letra) {
				 return true;
			 } else {
				 return false;
			 }
		 } else {
			  return false;
 		 }
		 
	  } 
}