package fr.dawan.formation;

public class typeBoolean {

    public static void main(String[] args) {

        
        /* Boolean : true ou false 
         * Valeur binaire qui ne peut avoir que 2 valeurs possible : vrai ou faux 
         * 
         */
        
        boolean bool = true ;
        
        /* Opérateurs conditionnels
         *      == égalité
         *      != différence
         *      > < supérieur à / inférieur à 
         *      >= <= supérieur ou égal / inférieur ou égal
         *      
         *      
         *      || OU           && ET
         */
        
        
        bool = !bool;
        
        bool = 4 < 10; //true
        
        bool = !false; //true
        bool = !(4 < 10); //false
        
        
//////////////////////////////////////////////////////////////////////////////////////////////
        
        
        String a = "Hello world";
        String b = "Hello ";
        
        b += "world";
        
        System.out.println(a == b); // false : vérifie en mémoire
        
        System.out.println(a.equals(b)); // true : vérifie le contenu de la string
        
        
    }

}
