//Write a program that counts the number of vowels and consonants in a given string. 
//Do this for the English language, which has five vowels (a, e, i, o, and u).

import java.util.Scanner;
public class CountingVowelsCosonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
      
        System.out.println("Type a string: ");
        String string = sc.nextLine();

        int countVowels = 0;
        int countConsonants = 0;

        char[] characters = string.toCharArray();    
        for (int i = 0; i < characters.length; i++) {
            if(characters[i] == 'a' || characters[i] == 'e' || characters[i] == 'i' || characters[i] == 'o' || characters[i] == 'u'){
                countVowels++;
            }else{
                countConsonants++;
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);

    

    }

}
