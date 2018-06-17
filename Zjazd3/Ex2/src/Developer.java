public class Developer implements User {
    String name = "Developer";
    @Override
    public void showInfo() {
        System.out.println("Role: " + name);
    };
}
