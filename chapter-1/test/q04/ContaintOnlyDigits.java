import java.util.Scanner;

public class ContaintOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a string: ");
        String string = sc.nextLine();
        boolean containOnlyDigits = true;
        
        
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if(!(character >= '0' && character <= '9')){
                containOnlyDigits = false;
                break;
            }
        }
        
        System.out.println("Contains only digits: " + containOnlyDigits);
    }
}
