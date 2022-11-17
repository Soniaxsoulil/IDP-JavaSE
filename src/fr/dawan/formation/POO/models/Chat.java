package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public final class Chat extends Felin implements EstDomestique {
    private static int count=0;
    
    public Chat () {
        count++;
    }
    
    public Chat (String name, int age, String couleur) {
        super(name, age, couleur, true, true);
        count++;
    }



    @Override
    public void crier () {
        System.out.println("Miaou Miaou");
    }
    
    
    public void demanderCroquettes() {
        System.out.println("Nourris moi, humaine !");
    }

    @Override
    public void demanderDesCaresses() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void jouerALaBalle() {
        // TODO Auto-generated method stub
        
    }
    
    
    public static int getCount() {
        return count;
    }
    
    
    
    
    
}
