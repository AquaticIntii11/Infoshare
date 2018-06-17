import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessText {
    String text;
    Integer dots = 0;
    public void countDots(String text){
        this.text = text;
        String pattern = "\\.";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(text);
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println("Found: dot at:  " + m.start() + " - " + m.end());
        }
        System.out.println("Dots: " + count);
    }
}
