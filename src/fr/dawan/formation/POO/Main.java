package fr.dawan.formation.POO;

import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Chien;
import fr.dawan.formation.POO.models.Felin;

public class Main {
    
    public static void main(String[] args) {

       Chien chien = new Chien();
       chien.setName("Medor");
        
        
        Chat chat = new Chat ("Cactus",10,"tabby" );
        System.out.println(chat.getName());
        chat.manger();
        
        
        chat.crier();
        chien.crier();
        
        
        Felin felin = new Felin ("Jean Michel", 103, "roux");
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderCroquettes();
        
        System.out.println(chat.getPelage());
        
        System.out.println(Animal.getCount());

        System.out.println(Chat.getCount());
        System.out.println(Felin.getCount());
        
        
        chat.switchPelage();
        
        
        
        // POLYMORPHISME
        
        
        

        
        
        
        
        
        
        
        
        
        
        
    }
}
