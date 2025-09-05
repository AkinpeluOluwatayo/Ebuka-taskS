import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        checkEvenAndOdd();
    }

    public static void checkEvenAndOdd() {
        Scanner input = new Scanner(System.in);

        int evenResult = 1;  
        int oddResult = 0;   
        int attempt = 0;

        int evenCount = 0;  
        int oddCount = 0;    

        while (true) {
            System.out.println("Enter number (0 to cancel): ");
            int number = input.nextInt();
            attempt++;

            if (number == 0) {
                System.out.println("Cancel");
                System.out.println("All attempts: " + (attempt - 1));
                break;
            }

            if (number % 2 != 0) {   
                oddResult += number;
                oddCount++;
            } else {                 
                evenResult *= number;
                evenCount++;
            }

           
           if (oddCount > 0) {
                System.out.println("Current odd result: " + oddResult);
            } else {
                System.out.println("Current odd result: 0");
            }

            if (evenCount > 0) {
                System.out.println("Current even result: " + evenResult);
            } else {
                System.out.println("Current even result: 0");
           }
     }
 }
}
