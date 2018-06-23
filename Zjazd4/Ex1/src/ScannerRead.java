import java.util.Scanner;

public class ScannerRead {
    public boolean shouldRead = true;

    public void readNumber(){
        while(shouldRead){
            try {
                System.out.println("Provide a number:");
                Scanner scanner = new Scanner(System.in);
                Integer number = scanner.nextInt();
                shouldRead = false;
            }
            catch (Exception e) {
                System.out.println("Value is not a number, try again.");
            }
        }
    }
}
