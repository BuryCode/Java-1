import java.util.*;
public class reversewords {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a Word: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(str);
        System.out.println("The reversed word is: " + reversed);
    }
    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}