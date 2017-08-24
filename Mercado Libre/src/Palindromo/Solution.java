package Palindromo;

import java.util.Scanner;

public class Solution {
	
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
		String[] cadenaSeparada = cadena.split(" ");
		boolean esPalindromo=true;
		
		for(int i=0;i<cadenaSeparada.length;i++){
			esPalindromo=true;
			char[] palabra = cadenaSeparada[i].toCharArray();
			for(int j=0;j<cadenaSeparada[i].length()/2;j++){
				if(palabra[j]!=palabra[palabra.length-1-j]){
					esPalindromo=false;
					break;
				}
			}
			if(esPalindromo && cadenaSeparada[i].length()!=1)
				System.out.println(cadenaSeparada[i]);
		}
		
		sc.close();
	 }
}
