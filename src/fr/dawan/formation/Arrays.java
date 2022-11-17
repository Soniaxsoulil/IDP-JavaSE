package fr.dawan.formation;

public class Arrays {

    public static void main(String[] args) {

        
        
    double [] tab = new double [3];
    
    System.out.println(tab[0]);  // Les valeurs sont initialisées par défaut
    
    
    
    /* Initialisation par défaut :
     * double : 0.0
     * int : 0
     * char : \u0000
     * boolean : false 
     * référence : null
     * 
     */
        
    
    tab[0]=1.5;
    
    for (int i=0; i<tab.length;i++) {
        System.out.println("tab de " + i + " = " + tab[i]);
    }
    
    
    for (double elements : tab ) {
        elements++; // Ne modifie pas dans le tableau : elements est une variable locale 
        System.out.println("Foreach : " + elements); // [1.0-1.0-1.0]
        
    }
    
    
    int entiers [] = {1,2,3};
    
    
   // System.out.println(entiers[3]); >> Soulève une exception Out of range
    
    int tablo[][] =  new int [3][3]; // Tableau de 3 lignes, contenant chacune un tableau de 3 zéros
    
    int tabloo[][] = { {1,2,3},{4,5,6},{7,8,9}};
    int cinq = tabloo[1][1];
    int sept = tabloo[2][0];
    
    for(int[] subtable : tabloo) {
        for (int value : subtable) {
    
    
    System.out.println(value);
        }
    }
    
    }
        
        
        
    }

