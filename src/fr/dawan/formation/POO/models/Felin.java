package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

public class Felin extends Animal {
    
    
    private boolean isSociable;
    private boolean hasGriffesRetractiles;
    
    
    public Felin() {
        super();
        this.setPelage (Peau.FOURRURE);
    }
    
    public Felin (String name, int age, String couleur) {
        super(name, couleur, age,4);
        this.setPelage (Peau.FOURRURE);
        
    }
    
    public Felin(String name, int age, String couleur, boolean sociable, boolean griffes) {
        super(name,couleur,age,4);
        this.isSociable = sociable;
        this.hasGriffesRetractiles = griffes;
        this.setPelage (Peau.FOURRURE);
    }


    @Override
    public void crier() {
        System.out.println("Graou Graou");
    }

    public boolean isSociable() {
        return isSociable;
    }

    public void setSociable(boolean sociable) {
        this.isSociable = sociable;
    }

    public boolean isHasGriffesRetractiles() {
        return hasGriffesRetractiles;
    }

    public void setHasGriffesRetractiles(boolean griffes) {
        this.hasGriffesRetractiles = griffes;
    }
  
    
}
