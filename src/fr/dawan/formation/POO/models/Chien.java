package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public class Chien extends Animal implements EstDomestique {

    @Override
    public void crier () {
        System.out.println("Wouaff Wouaff");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Yeah !");
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("");
    }
    
    
    
    
    
}
