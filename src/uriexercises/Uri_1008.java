package uriexercises;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		double salary = y * z;
		
		
		System.out.println("NUMBER = "+ x);
		System.out.println(String.format("SALARY = U$%.2f", salary));
		
		sc.close();


	}

}
