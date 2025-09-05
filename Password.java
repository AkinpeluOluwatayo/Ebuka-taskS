import java.util.Scanner;
public class Password {
 public static void main(String[] args){


	checkPassword();
	checkPassword2();
}
  public static  void checkPassword(){

  Scanner input = new Scanner(System.in);

	int attempt = 1;

    while(attempt <=3){

	int  password = 1234;
	
         System.out.println("Enter security login (4 digit pin)");
         int userPassword = input.nextInt();
	attempt++;
		 	 
	 if(userPassword == password){
      
         System.out.println("Access Granted");
	 break;

	  }else{
			
	  System.out.println("Try Again");
	  }	
            break;	
     }
	
  }

   public static void checkPassword2(){

   Scanner input = new Scanner(System.in);

   int  password = 1234;

   for(int index = 1; index <= 3; index++){

     System.out.println("Enter security login (4 digit pin)");
     int userPassword = input.nextInt();

     if(userPassword == password){

	 System.out.println("Access Granted");
		 break;
    }else{
			
	 System.out.println("Try Again");
			
         }

    }




}
}



















