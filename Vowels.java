import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word");
        String word = input.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int index = 0; index < word.length(); index++) {

            char characterCheck = word.charAt(index);

            if (characterCheck == 'a' || characterCheck == 'e' || characterCheck == 'i' ||  characterCheck == 'o' || characterCheck == 'u'){ 
                
                vowelCount++;

            } else if ((characterCheck >= 'a' && characterCheck <= 'z'){
                
                consonantCount++;

            } else {
                System.out.println(characterCheck + " is not a letter");
            }
        }

      
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
    }

}
