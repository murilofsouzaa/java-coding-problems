import java.util.Scanner;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String string = sc.nextLine();
        //banana

        int count = 0;
        int freq[] = new int[256];
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i)]++;
        }

        for (int i = 0; i < string.length(); i++) {
            if(freq[string.charAt(i)] > 1){
                count++;
            }
        }


        System.out.println(count);

        sc.close();

    }   
}
