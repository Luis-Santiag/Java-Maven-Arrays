package com.angel;
import java.util.Arrays;
public class App {
	 public static void main(String[] args) {
		 
	//Saludo 
	 System.out.println("Hola mundo desde Java");
	 
	 //Multiplicacio.n 
	 
     int a = 6;
     int b = 7;
     int resultado = a * b;

     System.out.println("Resultado: " + resultado);
     
     //Arreglo.s
     
  //Arrays.sort() 
     
     int[] numeros = {5, 2, 8, 1, 3};

  
  Arrays.sort(numeros);

  System.out.println(Arrays.toString(numeros));
  
  
   //Arrays.binarySearch()
  int[] Datos = {1, 2, 3, 5, 8};


int posicion = Arrays.binarySearch(Datos, 5);

System.out.println("Posición: " + posicion);

//Arrays.copyOf()

int[] original = {1, 2, 3};


int[] copia = Arrays.copyOf(original, 5);

System.out.println(Arrays.toString(copia));

//Arrays.fill()

int[] cantidades = new int[4];


Arrays.fill(cantidades, 7);

System.out.println(Arrays.toString(cantidades));

//Arrays.equals()

int[] n1 = {1, 2, 3};
int[] n2 = {1, 2, 3};

boolean iguales = Arrays.equals(n1, n2);

System.out.println("¿Son iguales? " + iguales);

     
     
}
}


