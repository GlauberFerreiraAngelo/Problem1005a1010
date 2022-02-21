package com.problem1008;

public class Main {

	public static void main(String[] args) {
		
		int numeroDoFuncionario, numeroDeHorasTrabalhadas;
		double valorHora;
		
		numeroDoFuncionario = 1;
		numeroDeHorasTrabalhadas = 200;
		valorHora = 20.50;
		
		System.out.println("NUMBER = " + numeroDoFuncionario);
		System.out.printf("SALARY = %.2f", (numeroDeHorasTrabalhadas * valorHora));
	}
}
