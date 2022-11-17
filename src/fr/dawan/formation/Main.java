package fr.dawan.formation;

public class Main {
    
    
    public static void main(String[]args) {
        
        System.out.println("Hello World");
        
        /* LES VARIABLES
         * Pour déclarer une variable : type nom ; 
         * 
         * Les types : int , String , double , boolean , char , short , float ...
         * 
         * Déclarer vs Initialiser :
         */
        
        String greeting ; //déclarée
        String message = "Hello World"; //déclarée et initialisée
        
        //name ="Toto"; -> erreur, variable non déclarée
        
        //System.out.println(greeting); -> erreur, variable non initialisée
        
        /* Règle de nommage :
         * - variables : camelCase, snake_case
         * -> PAS de kebab-case
         * - minuscules
         * - pas de mots réservés ( String, ect... )
         * - les noms de variables acceptent des lettres, des chiffres, certains caractères spéciaux _ , $
         * - Les noms de variable peuvent commencer par des lettres, ou des caractères spéciaux ( jamais de chiffres ) 
         */
        
    }

}
