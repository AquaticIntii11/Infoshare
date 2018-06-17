import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Count dots
        ProcessText sentence = new ProcessText();
        Scanner in = new Scanner(System.in);
        String text = in.nextLine(); //"This is a sentence with some dots. We like dots. Very much."
        System.out.println("Provide some text:");
        sentence.countDots(text);

        //Abstract clases
        User newUser = new Admin();
        newUser.showInfo();
    }
}