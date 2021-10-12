package com.projeto.atribuiçãoreferencia;

public class Main {

	public static void main(String[] args) {
		
		//Quando o java manipula os números primitivos, ele copia exatamente eles.
		
		int intA = 1;
		int intB = intA;
		
		System.out.println("intA = " + intA + " intB = " + intB);
		
		intA = 2;
		System.out.println("intA = " + intA + " intB = " + intB);

		//Quando o java usa a referncia, ele se comporta como ponteiro com o mesmo valor.
		MeuObj objA = new MeuObj(1);
		MeuObj objB = objA;
		
		System.out.println("\nobjA = " + objA + " objB = " + objB);
		objA.setNum(2);
		System.out.println("objA = " + objA + " objB = " + objB);
	}
}
