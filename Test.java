import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


	int tryagain = 0;
	int attempts = 0;

	System.out.println("Enter number between 1 - 5");
        int  number = scanner.nextInt();
	attempts++;

      if (number >= 1 && number <= 5) {
          System.out.println("Correct");
	}

    while (number < 1 || number > 5) {  
               
            if (number >= 1 && number <= 5) {

               System.out.println("Correct");
	        attempts++;

		break;
		
              }else{        	  
		
		System.out.println("Enter number between 1 - 5");
		number = scanner.nextInt();
		attempts++;
		tryagain++;
		
            }
        }

		System.out.println("The total attempt is:" + " " + attempts);

		System.out.println("The total wrong answer is:" + " " + tryagain);
}
}