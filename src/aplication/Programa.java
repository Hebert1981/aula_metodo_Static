package aplication;

import java.util.Locale;
import java.util.Scanner;

import estation.metodos;

public class Programa {
	
	public static final double  PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter radius");
	double radius = sc.nextDouble();
	
	double c = metodos.circumference(radius);
	double v = metodos.volume(radius);
	
	
	System.out.printf("Circumference : %.2f%n ", c);
	System.out.printf("Volume : %.2f%n ", v);
	System.out.printf("PI : %.2f%n ", metodos.PI);
	
	
	sc.close();
		
		
		
		
		
		
		
		
		
		

	}

}
