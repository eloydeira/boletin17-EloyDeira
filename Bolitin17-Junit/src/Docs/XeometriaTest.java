package Docs;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exercicios.Xeometria;


	public class XeometriaTest {

		@Test
		public void testperimetroCadrado() {
			Xeometria operacions= new Xeometria();
			assertEquals(4,operacions.perimetroCadrado(1));
			assertEquals(0,operacions.perimetroCadrado(0));
			assertEquals(-4,operacions.perimetroCadrado(-1));
			assertEquals(20,operacions.perimetroCadrado(5));
			assertEquals(-20,operacions.perimetroCadrado(-5));
		}

		@Test
		public void testareaCadrado() {
			Xeometria operacions= new Xeometria();
			assertEquals(1,operacions.areaCadrado(1));
			assertEquals(0,operacions.areaCadrado(0));
			assertEquals(4,operacions.areaCadrado(2));
			assertEquals(9,operacions.areaCadrado(3));
			assertEquals(1,operacions.areaCadrado(-1));
			assertEquals(4,operacions.areaCadrado(-2));
			assertEquals(9,operacions.areaCadrado(-3));
		}
		@Test
		public void testteoremaPitagoras() {
			Xeometria operacions= new Xeometria();
			assertEquals(1.414,operacions.teoremaPitagoras(1,1), Math.sqrt(2));
			assertEquals(2,operacions.teoremaPitagoras(0,2), Math.sqrt(4));
			assertEquals(2,operacions.teoremaPitagoras(2,0), Math.sqrt(25));
			assertEquals(0,operacions.teoremaPitagoras(0,0), Math.sqrt(0));
			assertEquals(5,operacions.teoremaPitagoras(3,4), Math.sqrt(25));
			assertEquals(5,operacions.teoremaPitagoras(-3,4), Math.sqrt(25));
			assertEquals(5,operacions.teoremaPitagoras(3,-4), Math.sqrt(25));
			assertEquals(5,operacions.teoremaPitagoras(-3,-4), Math.sqrt(25));
		}
		@Test
		public void testteoremaPitagorasB() {
			Xeometria operacions= new Xeometria();

			assertEquals(0,operacions.teoremaPitagoras2(0,0), Math.sqrt(0));
			assertEquals(Double.NaN,operacions.teoremaPitagoras2(0,2), Math.sqrt(-4));
			assertEquals(2,operacions.teoremaPitagoras2(2,0), Math.sqrt(4));
			assertEquals(0,operacions.teoremaPitagoras2(1,1), Math.sqrt(0));
			assertEquals(Double.NaN,operacions.teoremaPitagoras2(3,4), Math.sqrt(-9));
			assertEquals(Double.NaN,operacions.teoremaPitagoras2(-3,4), Math.sqrt(-9));
			assertEquals(Double.NaN,operacions.teoremaPitagoras2(3,-4), Math.sqrt(-9));
			assertEquals(Double.NaN,operacions.teoremaPitagoras2(-3,-4), Math.sqrt(-9));
		
		}
	}
