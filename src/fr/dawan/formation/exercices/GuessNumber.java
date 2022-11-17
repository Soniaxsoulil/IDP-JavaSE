package fr.dawan.formation.exercices;


import java.util.Scanner;

public class GuessNumber {

  
    
    public static void main(String[] args) {

 
        Scanner scan = new Scanner(System.in);

        
        int nombre_a_deviner = 54;
        
        System.out.println("Devinez un nombre entre 0 et 100 \n");
        System.out.println("Entrez le nombre à deviner");
        int nombre=scan.nextInt();
        
        
        while (nombre!=nombre_a_deviner) {
            System.out.println("Ce n'est pas la bonne réponse");
            
             if (nombre<nombre_a_deviner) {
                System.out.println("Trop petit ! ");
                break;
             }
            else if (nombre>nombre_a_deviner) {
                System.out.println("Trop grand ! ");
            break;
            }
        }
        
       
        
     
      
        
       do {
            System.out.println("\nRetentez votre chance ! Entrez un nouveau nombre");
            nombre=scan.nextInt();
        if (nombre < 54 && nombre > 40) {
            System.out.println("Ça brûle ! Vous vous rapprochez !");
        } else if (nombre <= 20 || nombre >= 60) {
            System.out.println("Ça se rapproche mais ce n'est pas encore ça ! Recommencez");
        } else if (nombre <= 40 || nombre >= 80) {
            System.out.println("C'est froid ! Retentez votre chance");
        }
        if (nombre==nombre_a_deviner) {
            System.out.println("Bravo !! Vous avez trouvé le nombre mystère");
        }
        
        }  while (nombre!=nombre_a_deviner );


    }

    
}
    
    




