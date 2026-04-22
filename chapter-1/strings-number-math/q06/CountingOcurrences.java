import java.util.Scanner;
public class CountingOcurrences {

    public static int countingOcurrencesOfCharacter(String string, char character){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a string: ");
        String string = sc.nextLine();

        System.out.print("Type a character: ");
        char character = sc.next().charAt(0);

        int occurencies = countingOcurrencesOfCharacter(string, character);
        System.out.printf("The character '%c' appears %d times", character, occurencies);
    }
}
