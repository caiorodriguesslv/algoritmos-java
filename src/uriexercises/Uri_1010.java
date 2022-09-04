package uriexercises;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1 = sc.nextInt();
		int n1 = sc.nextInt();
		double vn1 = sc.nextDouble();
		
		int c2 = sc.nextInt();
		int n2 = sc.nextInt();
		double vn2 = sc.nextDouble();
		
		double total = (n1 * vn1) + (n2 * vn2);
		System.out.println("CODIGO DOS PRODUTOS: "+ c1 +"/"+ c2);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
		
		
		sc.close();

	}

}
