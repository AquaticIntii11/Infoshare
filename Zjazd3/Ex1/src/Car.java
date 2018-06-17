public class Car implements Vehicle {
    @Override
    public void drive(){
        System.out.println("Car is driven");
    };

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
}
