package pktCalculo;

import java.util.Scanner;

public class Calculadora {
	
	public void main(String[] arg) {
		
		
		//Declaración de variables y objetos
				float num = 0.00f, num2 = 0.00f;
				Scanner ent = new Scanner(System.in); //Entrada de datos
				int operacion = 0;
				
				//Comienza la lógica de la calculadora
				
				do {
					System.out.println("Introduce el primer operador");
					num = ent.nextFloat();
				
					System.out.println("introducir operación: \n" +
						"0º) Salir \n" +
						"1º) Suma \n" +
						"2º) Resta \n" +
						"3º) Multiplicación \n" +
						"4º) División ");
					operacion = ent.nextInt();
					
					if(operacion >= 1 && operacion <= 4) {
						do {
							System.out.println("Introduce el segundo operador");
							num2 = ent.nextFloat();
						}while(num2 == 0 && operacion == 4);//Esto es para que vuelvas a introducir el segundo operador si este es 0 en la division
						
						
						switch(operacion) {
						case 0: suma();
							break;
						case 1: resta();
							break;
						case 2: multiplicacion();
							break;
						case 3: division();
							break;
							
							
						}
					
					}else if(operacion!=0){
						System.out.println("Error, operación no válida");
					}else {
						System.out.println("Adios");
					}
				}while(operacion != 0); //Salimos con la opcion 0
				System.out.println("Fin");

	}

}
