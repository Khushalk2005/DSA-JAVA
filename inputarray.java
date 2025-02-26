import java.util.Scanner;
public class inputarray {
    public static void main(String[] args) {
        // input using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element at index " +i);
            arr[i] = sc.nextInt();
        }
        // To Print The Elements of An Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    
}
