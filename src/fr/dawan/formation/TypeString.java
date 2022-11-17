package fr.dawan.formation;

import java.util.Scanner;

public class TypeString {

    public static void main(String[] args) {

        /* Les caractères : type primitif
         * type char 
         *      - 16bits / 2octets
         *      - Accepte un    caractère ( une lettre ) 
         *                      caractère unicode
         *                      hexadecimal
         *      - Valeur par défaut : 'a'
         *      
         */
        
        
        char a ='a'; // On utilise des simples quotes 
        System.out.println(a);
        
        a = 0x00061; // 'a' en hexadecimal
        
        a = '\u0061'; // 'a' en unicode
        
        System.out.println(a); // a
        a++;
        System.out.println(a); // b 
        
        
        // Caractères d'échappement
        /*
         * Certains caractères servent à passer des instructions particulières au compiler 
         * Ces caractères sont précédés d'un backslash \ qui sert à les échapper 
         * Echapper : modifier son sens classique
         */
        
        char quote = '\'';
        String guillemet = "\"";
        
        
        
        
        // String = chaine de caractères 
        
        
        String name = "Jane Doe";
        String greetings = "Bonjour";
        
        // Concaténation
        System.out.println(greetings + " " + name);
        
        int age = 121;
        System.out.println(name + " a " +age + " ans ");
        // Le caste d'un int vers une String est implicite
        
        
        
        System.out.println(name.toUpperCase()); // MAJUSCULES
        System.out.println(name.toLowerCase()); // minuscules
        System.out.println(name.length()); // taille de la String
        System.out.println(name.equals(greetings)); // true ou false
        System.out.println(name.compareTo("Jane Doe !")); // -2 : name à 2 caractères différents
        System.out.println(name.compareToIgnoreCase("Jane Doe")); // 0
        
        
        
        
        
        String [] splitted = name.split(" "); // ["Jane" , "Doe"]
        splitted = name.split(" "); // coupe caractère par caractère ["J" , "a" , "n" , .... ]
        
        System.out.println("a".compareTo("cb"));
        
        String sub = name.substring(5); // Va chercher à partir du char 5 tout le reste de la chaîne
        System.out.println(sub); // Doe
        
        
        System.out.println(name.charAt(0)); // J
        
        System.out.println(name.indexOf("e")); // Va chercher l'index du 1er char trouvé correspondant 
        
        
        
        
        // COMMUNIQUER AVEC L'UTILISATEUR 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entrez votre prenom : ");
        String firstname = scan.next();
        String lastname = scan.next();
        
        scan.nextLine();
        
        System.out.println("Bonjour " + firstname + " | " + lastname);
       
        
        System.out.println("Entrez votre prenom : (again)");
        String username = scan.nextLine();
        
        System.out.println("Vous êtes " + username);
        
        System.out.println("Quel est votre âge ?");
        
        int userage = scan.nextInt();
        System.out.println("Vous avez " + userage + "ans");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
