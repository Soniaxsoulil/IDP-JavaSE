package fr.dawan.formation.exercices;

import java.util.Scanner;

public class Calculatrice {
    
    
    
    public static void main (String [] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Entrez un nombre A : ");
        double nombre_A = scan.nextDouble();
        System.out.println("Entrez un nombre B : ");
        double nombre_B = scan.nextDouble();
        
        System.out.println("Que souhaitez vous faire ?\n");
        System.out.println("- Taper [A] pour additionner");
        System.out.println("- Taper [B] pour soustraire");
        System.out.println("- Taper [C] pour multiplier");
        System.out.println("- Taper [D] pour diviser");

        String operateur = scan.next();
        
        switch (operateur) {
        case "A" :
            System.out.println(nombre_A + " + " + nombre_B + " = " + (nombre_A+nombre_B));
            break;
        case "B" :
            System.out.println(nombre_A + " - " + nombre_B + " = " + (nombre_A-nombre_B));
            break;
        case "C" :
            System.out.println(nombre_A + " x " + nombre_B + " = " + (nombre_A*nombre_B));            
            break;
        case "D" :
            System.out.println(nombre_A + " / " + nombre_B + " = " + (nombre_A/nombre_B));
        break;
        }
        
        
        System.out.println("\n--------------------------------------\n");
        
        do {
            
            
            System.out.println("Entrez votre calcul");
            
            int n1 = scan.nextInt();
            String op = scan.next();
            int n2 = scan.nextInt();
            
            switch(op) {
            case "+": 
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
            case "x" :
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            case "%":
                System.out.println(n1 % n2);
                break;
            default: 
                System.out.println("Opération invalide");
                
            }
            
            System.out.println("Recommencer ? y: yes, n: no");
        
        } while(scan.next().toLowerCase().equals("y") 
                || scan.next().toLowerCase().equals("yes"));
        
        System.out.println("Bye !");
        

    }
    
    

}