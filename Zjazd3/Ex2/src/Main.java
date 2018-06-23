import com.sun.org.apache.bcel.internal.classfile.InnerClass;

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

        class OuterClass {
            private String outerString = "outer";
            class InnerClass{}

            public InnerClass inicjalizeInnerClass(){
                //public String innerString = "inner";
                return new InnerClass();
            }
        }
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.outerString);

    }
}