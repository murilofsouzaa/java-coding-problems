package q03;
import java.util.Scanner;

//Reversing letters and words: Write a program that reverses the letters of 
//each word and a program that reverses the letters of each word and the words themselves.

public class ReversingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a phrase: ");
        String string = sc.nextLine();

        char[] reversedLetters = string.toCharArray();
        int start = 0;
        for (int i = 0; i < reversedLetters.length; i++) {
            if(i == reversedLetters.length || reversedLetters[i] == ' '){
                int end = i - 1;

                while(start < end){
                    char temp = reversedLetters[start];
                    reversedLetters[start] = reversedLetters[end];
                    reversedLetters[end] = temp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        

        int k = 0;
        char[] reversedWordAndLetters = new char[string.length()];
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedWordAndLetters[k] = string.charAt(i);
            k++;
        }


        System.out.println("\n");
        
        System.out.println("Letters:");
        for (int i = 0; i < reversedLetters.length; i++) {
            System.out.print(reversedLetters[i]);
        }
        
        System.out.println("\n");
        
        System.out.println("Words and letters:");
        for (int i = 0; i < reversedWordAndLetters.length; i++) {
            System.out.print(reversedWordAndLetters[i]);
        }

        System.out.println("\n");
    }
}
