package jobsheet4;
import java.util.Scanner;
public class MainFactorial {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input number : ");
    int num = input.nextInt();

    Factorial fk = new Factorial();
    System.out.println("Factorial of " + num + " is " + fk.factorialBF(num));
    System.out.println("Factorial of " + num + " is " + fk.factorialDC(num));



    } 
}
