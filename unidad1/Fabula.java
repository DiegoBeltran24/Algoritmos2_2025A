package unidad1;

import java.util.Scanner;

public class Fabula {

	public static void main(String[] args) {

		int avancet, avancel, pasos_totales, pasost, pasosl, distancia;
		Scanner lector = new Scanner(System.in);
		distancia = 20;
		avancet = 0;
		avancel = 0;

		while (avancet < distancia && avancel < distancia) {

			System.out.println("ingrese el numero de pasos que avanza la tortuga: ");
			pasost = lector.nextInt();

			System.out.println("ingrese el numero de pasos que avanza la liebre: ");
			pasosl = lector.nextInt();

			avancet = avancet + pasost;

			avancel = avancel + pasosl;

			System.out.printf("Tortuga ha avanzado %d, liebre ha avanzado %d ", avancet, avancel);
		}
		
		if(avancel>avancet)
		{
			System.out.println("Gano la liebre");
		}
		else
		{
			if(avancet>avancel)
			{
				System.out.println("Gano la tortuga");
			}
			else
			{
				System.out.println("Hubo empate");
			}
		}
	}
}
