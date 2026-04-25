import java.util.Scanner;

//Removing white spaces from a string: Write a program that removes all white spaces from the given string.

public class RemovingSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string:");

        String string = sc.nextLine();
        char[] characters = string.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        for (int i = 0; i < characters.length; i++) {
            if(characters[i] == ' ' || characters[i] == characters[end]){
                start = i + 1;
                characters[i] =  characters[start];
            }
        }

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
}
