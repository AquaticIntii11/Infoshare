package com.infoshare;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //String retText = App.hello("Aoi"); //could be only hello() as methods are static
        //System.out.println(retText);

        //dog class
        //Dog husky = new Dog("husky", 40, "Aoi" , 0.7);
        //husky.bark();
        //double bmi = husky.countBmi();
        //System.out.println("BMI: "+bmi);

        System.out.println("Malamute female");
        FemaleDog malamute = new FemaleDog("malamute", 60, "Kai");
        //malamute.bark();

        System.out.println("Buldog male");
        MaleDog buldog = new MaleDog();
        //buldog.bark();

        System.out.println("Just dog");
        Dog doggy = new Dog("golden", 40, "Miku", 60);
        //doggy.bark();

        //wataha
        Wataha newTribe = new Wataha();
        newTribe.addMember(doggy);
        newTribe.addMember(malamute);
        newTribe.addMember(buldog);
        newTribe.showMembers();
        System.out.println(newTribe.showMembersNames());

    }
    public static String hello (String text){
        return "Hello "+text;
    }

}
