import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNum = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNum = sc.nextDouble();

        System.out.println("Enter operation (+, -, *, /, %): ");
        char operation = sc.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if(secondNum == 0){
                    System.out.println("Second number should not be zero.");
                    sc.close();
                    return;
                }

                result = firstNum / secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;

            default:
                System.out.println("Invalid operation.");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}