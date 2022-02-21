package com.problem1010;

public class Main {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		int codigoDaPeca, numeroDePecas;
		double valorUnitario, total = 0;

		codigoDaPeca = 13;
		numeroDePecas = 2; 
		valorUnitario = 15.30;
		total += loja.saldo(codigoDaPeca, numeroDePecas, valorUnitario);

		codigoDaPeca = 161;
		numeroDePecas = 4; 
		valorUnitario = 5.20;
		total += loja.saldo(codigoDaPeca, numeroDePecas, valorUnitario);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
	}
}
