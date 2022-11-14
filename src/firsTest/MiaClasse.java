package firsTest;

import java.util.Scanner;


public class MiaClasse {
	 public static void main(String[] args) {
		 
      Scanner sc = new Scanner(System.in);
	        
	        System.out.println("come ti chiami??");
	        System.out.println("\n");
	        String name = sc.nextLine();
	       
	        System.out.println("e il tuo cognome??");
	        System.out.println("\n");
	        String surname = sc.nextLine();
	        
	        System.out.println("e il tuo colore preferito??");
	        System.out.println("\n");
	        String colour = sc.nextLine();
	       
	      
	        System.out.println("e quando sei nato??");
	        System.out.println("\n");
	        int day  = sc.nextInt();
	        
	        System.out.println("e il mese??");
	        System.out.println("\n");
	        int month = sc.nextInt();
	        
	        System.out.println("e l anno??");
	        System.out.println("\n");
	        int year = sc.nextInt();
	       
	        int dateOfBirth = day + month + year;
	        String SimoneDiPrima = name  + surname + colour  + dateOfBirth;
	        System.out.print(SimoneDiPrima);
	        
	     
	        
	        
	        
	    }
}
