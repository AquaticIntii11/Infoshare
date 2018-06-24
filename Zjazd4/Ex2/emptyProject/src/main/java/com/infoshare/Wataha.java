package com.infoshare;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Wataha {
    List<Dog> members = new ArrayList<>();
    Dog alfa = new Dog();

    public void addMember(Dog newDog){
        this.members.add(newDog);
        if (this.members.size() == 1){
            alfa = newDog;
        }
    }
    public void showMembers(){
        for (Dog dog: this.members) {
            System.out.println(dog + " " + dog.name + " " + dog.race);
        }
    }

    public String showMembersNames(){
        String names = "";
        //this.members.sort();
        for (Dog dog: this.members) {
            names+= dog.name;
            //if (dog.curren != -1)
            //        names+= ", ";
        }
        return names;
    }

}
