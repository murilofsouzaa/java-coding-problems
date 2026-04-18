import java.util.Scanner;

public class FindNonRepeatCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a string:");
        String string = sc.nextLine();

        int count = 0;
        int freq[] = new int[256];
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i)]++;
        }

        for (int i = 0; i < string.length(); i++) {
            if(freq[string.charAt(i)] == 1){
                count++;
            }
        }

        System.out.println(count);


    }
}
