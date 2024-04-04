import java.util.*;
class simpleinterest25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        double interest = (principle * time * rate) / 100;
        System.out.println("Principle: " + principle);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + interest);
        input.close();
    }
}