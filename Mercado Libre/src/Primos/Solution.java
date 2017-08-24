package Primos;

public class Solution {

	 public static void main(String[] args) {
		 boolean esPrimo=true;
		 for(int i=3000;i<9000;i++){
			 esPrimo=true;
			 for(int j=2;j<i;j++){
				 if(i%j==0){
					 esPrimo=false;
					 break;
				 }
			 }
			 if(esPrimo)
				 System.out.println(i);
		 }
		 
	 }
	
}
