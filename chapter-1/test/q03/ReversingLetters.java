package q03;
import java.util.Scanner;

//Reversing letters and words: Write a program that reverses the letters of 
//each word and a program that reverses the letters of each word and the words themselves.

public class ReversingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a phrase: ");
        String string = sc.nextLine();

        
        int k = 0;
        char[] reversedWordAndLetters = new char[string.length()];
        for (int w = string.length() - 1; w >= 0; w--) {
            reversedWordAndLetters[k] = string.charAt(w);
            k++;
        }

        System.out.println("\n");

        System.out.println("Words and letters:");
        for (int w = 0; w < reversedWordAndLetters.length; w++) {
            System.out.print(reversedWordAndLetters[w]);
        }

        System.out.println("\n");
    }
}
