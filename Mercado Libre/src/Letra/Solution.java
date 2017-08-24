package Letra;

import java.util.Scanner;

//Asumo que en la palabra solo hay letras mayusculas y minusculas

public class Solution {
	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		 
		 int[] letras = new int[52];
		 char[] cad= cadena.toCharArray();
		
		for(int i=0;i<cad.length;i++){
			 if(cad[i]>='a' && cad[i]<='z')
				 letras[cad[i]-71]++;
			 else if(cad[i]>='A' && cad[i]<='Z')
				 letras[cad[i]-'A']++;
		 }
		
		int max=-1;
		int pos=-1;
		for(int i=0;i<letras.length;i++){
			if(letras[i]>max){
				max=letras[i];
				pos=i;
			}
		}
		
		char letraMasRepetida='A';
		if(pos>=0 && pos<=25){
			letraMasRepetida+=pos;
			System.out.println("La letras mas repetida es: "+letraMasRepetida);
		}
		else{
			letraMasRepetida+=pos+6;
			System.out.println("La letras mas repetida es: "+letraMasRepetida);
		}
		
		sc.close();
	 }

}
