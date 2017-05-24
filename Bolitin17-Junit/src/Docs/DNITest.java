package Docs;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exercicios.DNI;

public class DNITest {

	

	@Test
	public void testEValido() {
		DNI dni=new DNI();
		
		assertEquals(dni.eValido("1234567811"),false);
		assertEquals(dni.eValido("1234567"),false);
		assertEquals(dni.eValido("W2345678Q"),false);
		assertEquals(dni.eValido("12345678Q"),false);
		assertEquals(dni.eValido("12345078N"),true);
		assertEquals(dni.eValido("12345678&"),false);
		assertEquals(dni.eValido("123456781"),false);
		
	}

	@Test
	public void testCalculaLetra() {
		DNI dni=new DNI();
		
		assertEquals(dni.calculaLetra("123456781"),-1);
		assertEquals(dni.calculaLetra("12345678"),14);
		assertEquals(dni.calculaLetra("W2345678"),-1);
		assertEquals(dni.calculaLetra("$2345678"),-1);
		
	}

	@Test
	public void testCalculaLetraArrayList() {
		DNI dni=new DNI();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(dni.eValidoArrayList(numeros,'N'),true);
		numeros.remove(5); 
		numeros.add(5,63);
		assertEquals(dni.eValidoArrayList(numeros,'N'),false);
		numeros.remove(5); 
		numeros.add(5,6);
		assertEquals(dni.eValidoArrayList(numeros,'N'),false);
		numeros.add(8,9);
		assertEquals(dni.eValidoArrayList(numeros,'N'),false);
		
	}

	@Test
	public void testEValidoArrayList() {
		DNI dni=new DNI();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(dni.calculaLetraArrayList(numeros),12);
		numeros.remove(5); 
		numeros.add(5,63);
		assertEquals(dni.calculaLetraArrayList(numeros),-1);
		numeros.remove(5);
		numeros.add(5,0);
		numeros.add(8,9);
		assertEquals(dni.calculaLetraArrayList(numeros),-1);
		
	}

}
