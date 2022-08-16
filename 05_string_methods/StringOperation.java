import java.lang.*;

public class StringOperation {
    public static void main(String[] args) {
        String s1 = "kle bca";
        String s2 = "college";

        System.out.println("Lenght: " + s1.length());
        System.out.println("UpperCase: " + s1.toUpperCase());
        System.out.println("LowerCase: " + s1.toLowerCase());
        System.out.println("Concatination: " + s1.concat(s2));
        System.out.println("Char at: " + s1.charAt(2));
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("SubString: " + s1.substring(3));
        System.out.println("SubString: " + s1.substring(3, 6));
        System.out.println("Replace: " + s1.replace('c', 'b'));
        System.out.println("Index of: " + s2.indexOf('l'));
        char[] a = s2.toCharArray();
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
