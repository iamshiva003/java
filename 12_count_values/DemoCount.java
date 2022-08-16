// 12 Program to count number of strings, integers and float values through command line arguments.

import java.lang.*;

public class DemoCount {
    public static void main(String[] args) {
        int chVal=0, strVal=0, iVal=0, dVal=0;

        for(int i=0; i<args.length; i++) {
            if(args[i].matches("[a-zA-Z]+")) {
                if(args[i].length() == 1) {
                    chVal++;
                }
                else {
                    strVal++;
                }
            }
            if(args[i].matches("[0-9]+")) {
                iVal++;
            }
            if(args[i].matches("[+-]?\\d+\\.?(\\d+)?")) {
                dVal++;
            }
        }
        dVal = dVal - iVal;

        System.out.println("Char's Value: " + chVal);
        System.out.println("String's Value: " + strVal);
        System.out.println("int's Value: " + iVal);
        System.out.println("Double's Value: " + dVal);
    }
}
