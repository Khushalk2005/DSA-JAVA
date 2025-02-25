import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the option : 1 = addition" );
        System.out.println("Choose the option : 2 = subtraction" );
        System.out.println("Choose the option : 3 = multiplication" );
        System.out.println("Choose the option : 4 = division" );    
        System.out.println("Choose the option : 5 = exit" );
        System.out.println("enter the option for doing operations ");
        int option = input.nextInt();
        
        switch (option) {
            case 1:
                {
                    System.out.println("enter the first number");
                    int num1 = input.nextInt();
                    System.out.println("enter the second number");
                    int num2 = input.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum is " + sum);
                    break;
                }
            case 2:
                {
                    System.out.println("enter the first number");
                    int num1 = input.nextInt();
                    System.out.println("enter the second number");
                    int num2 = input.nextInt();
                    int difference = num1 - num2;
                    System.out.println("Difference is " + difference);
                    break;
                }
            case 3:
                {
                    System.out.println("enter the first number");
                    int num1 = input.nextInt();
                    System.out.println("enter the second number");
                    int num2 = input.nextInt();
                    int product = num1 * num2;
                    System.out.println("Product is " + product);
                    break;
                }
            case 4:
                {
                    System.out.println("enter the first number");
                    int num1 = input.nextInt();
                    System.out.println("enter the second number");
                    int num2 = input.nextInt();
                    if (num2 != 0){
                        int quotient = num1 / num2;
                        System.out.println("Quotient is " + quotient);
                    }       break;
                }
            default:
                break;
        }

    }
    
}
