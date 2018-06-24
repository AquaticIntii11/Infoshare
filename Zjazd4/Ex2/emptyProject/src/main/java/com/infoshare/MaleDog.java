package com.infoshare;

public class MaleDog extends Dog {
    MaleDog(String race, float weight, String name, double height){
        super(race, weight, name, height);
    }
    MaleDog(String race, float weight, String name){
        super(race, weight, name);
    }
    MaleDog(){
    }
    @Override
    public void bark(){
        System.out.println("Male dog " + this.name + " of race " + this.race + ", height " + this.height + ", and weight " + this.weight + " is barking.");
    }
}
