public class Main {
    public static void main(String[] args) {

        //Eqalstest
        EqualsTest obj1 = new EqualsTest("name", 1, 'a');
        EqualsTest obj2 = new EqualsTest("name", 1, 'a');

        System.out.println(obj1.equals(obj2));
        //System.out.println(obj1.hashCode());
        //System.out.println(obj2.hashCode());
        System.out.println(obj1==obj2);

        //Animals
        Animal unknowAnimal = new Animal();
        Dog husky = new Dog();
        Hamster roborosky = new Hamster();

        unknowAnimal.eat();
        husky.eat();
        roborosky.eat();;

        husky.bark();
        roborosky.runInWheel();

        //Exceptions
        Integer[] numberTable = new Integer[10];
        try {
            System.out.println(numberTable[15]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        //Abstract
        Car car = new Car();
        Vehicle vehicle = new Car();

        //Abstract MyMenu example
        Menu menu = new MyMenu();

        //Menu object from abstract class
        MenuFromAbstractMenu menuFromAbstract = new MenuFromAbstractMenu();
        menuFromAbstract.AbstractMethod();
    }

}