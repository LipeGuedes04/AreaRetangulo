package aplicatioon;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoArea;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoArea retangulo = new CalculoArea();
		System.out.println("Enter rectangle width and height: ");
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();

		System.out.print(retangulo);
		
		
		sc.close();

	}

}
