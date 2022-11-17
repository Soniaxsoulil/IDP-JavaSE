package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

abstract public class Animal {
    
    /*
     * POJO : Plain Old Java Object > classe sans restriction
     * Java Beans - type de POJO -> classe qui contient un constructeur, attributs privés, getters et setters, serializable
     * Bonne pratique, convention d'écriture
     * 
     * Public -> elements utilisable partout avec un import
     * Private -> utilisable dans la classe uniquement
     * Protected -> utilisable uniquement dans le package
     * 
     */
    
    
    private int nbLegs, age;
    private String couleur,name;
    private Peau pelage;
    private static int count =0;
    
    




    public Animal() {
        count++;
    }
    
    
    
    public Animal(String name, String couleur, int age) {
        this.age = age;
        this.couleur = couleur;
        this.name = name;
       count++;
    }
    public Animal(String name, String couleur, int age, int nbLegs) {
        this.age = age;
        this.couleur = couleur;
        this.name = name;
        this.nbLegs = nbLegs;
    }
    
    public void manger() {
        System.out.println(this.name + " dit Miam Miam");
    }
    
    
    public void switchPelage() {
        
        switch(this.pelage) {
        
        case FOURRURE:
            System.out.println("Perd ses poils partouts");
            
        case ECAILLES:
            System.out.println("Pas agréable à carresser");
        }
    }
    
    public abstract void crier();



    public int getNbLegs() {
        return nbLegs;
    }



    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        if (age>0)
        this.age = age;
    }



    public String getCouleur() {
        return couleur;
    }



    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Peau getPelage() {
        return pelage;
    }



    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    }



    public static int getCount() {
        return count;
    }



   
    
    
}    

