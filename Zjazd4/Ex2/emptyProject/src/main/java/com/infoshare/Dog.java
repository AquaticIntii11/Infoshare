package com.infoshare;

public class Dog extends Animal{
    String race = "";
    float weight = 0;
    String name = "";
    double height = 0;


    public Dog(String race, float weight, String name, double height) {
        this.race = race;
        this.weight = weight;
        this.name = name;
        this.height = height;
        //System.out.println("Created from (1) " + this.race + " " + this.weight + " " + this.name + " " +this.height);
    }

    public Dog(String race, float weight, String name) {
        this.race = race;
        this.weight = weight;
        this.name = name;
        this.height = 0;
        //System.out.println("Created from (2) " + this.race + " " + this.weight + " " + this.name + " " +this.height);
    }

    public Dog() {
        this("Unknown", 100, "As", 100);
        //System.out.println("Created from (3) " + this.race + " " + this.weight + " " + this.name + " " +this.height);
    }

    public void bark(){
            System.out.println("Dog " + this.name + " of race " + this.race + ", height " + this.height + ", and weight " + this.weight + " is barking.");
    };
    public double countBmi(){
        return this.weight/(this.height*this.height);
    }
    public void toilet(){
        System.out.println("Dog " + this.name + " had to go outsie.");
    }
}
