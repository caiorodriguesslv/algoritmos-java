package uriexercises;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		double comissao = salario + (vendas * 0.15);
		
		System.out.println("NOME DO VENDEDOR = "+ nome);
		System.out.println(String.format("TOTAL = R$ %.2f", comissao));
		
		
		sc.close();

	}

}
