package com.infoshare;

public class FemaleDog extends Dog {

    FemaleDog(String race, float weight, String name, double height){
        super(race, weight, name, height);
    }
    FemaleDog(String race, float weight, String name){
        super(race, weight, name);
    }
    FemaleDog(){
    }
    @Override
    public void bark(){
        System.out.println("Female dog " + this.name + " of race " + this.race + ", height " + this.height + ", and weight " + this.weight + " is barking.");
    }
}
