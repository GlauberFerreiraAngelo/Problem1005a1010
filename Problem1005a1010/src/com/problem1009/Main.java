package com.problem1009;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		double salario, vendas;
		
		nome = "MANGOJATA";
		salario = 1700.00;
		vendas = 1230.50;
		
		System.out.printf("TOTAL = %.2f", (salario + (vendas*0.15)));
		
	}
}
