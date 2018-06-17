public class Admin implements User{
    String name = "Admin";
    @Override
    public void showInfo() {
        System.out.println("Role: " + name);
    };
}
