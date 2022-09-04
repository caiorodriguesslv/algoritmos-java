package uriexercises;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double media = ((x * 2.0) + (y * 3.0) +(z * 5.0) ) / 10;
		
		System.out.println(String.format("MEDIA = %.1f", media));
		
		
		sc.close();

	}

}
