package uriexercises;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double media = ((x * 3.5) + (y * 7.5)) / 11;
		
		System.out.println(String.format("MEDIA = %.5f", media));
		
		
		sc.close();
				
				

	}

}
