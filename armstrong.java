import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int num1 = num;
        int count = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count++;
        }
        int num2 = num;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int digit = num2 % 10;
            sum = sum + (int) Math.pow(digit, count);
            num2 = num2 / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } 
        else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
        

    
}
