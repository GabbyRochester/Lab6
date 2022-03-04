import java.util.Scanner;

public class Lab6Repository {

    public static void main(String[]args){
        Scanner scner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;


        System.out.println("Enter first number: ");
        firstNumber = scner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scner.nextInt();

        int result = firstNumber -= secondNumber;

        System.out.println(result);
    }

}
