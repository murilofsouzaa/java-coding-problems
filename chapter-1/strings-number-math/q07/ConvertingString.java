import java.util.Scanner;
public class ConvertingString<T> {
    
    private static void checkingWord(String string){

        char[] word = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if(!(word[i] >= '0' && word[i] <= '9')){
                throw new IllegalArgumentException("You can't type words, only numbers");
            }
        }
    }
    private static void convertingString(String string, String type){

        Object obj = null;

        try {
            checkingWord(string);
            switch (type.toLowerCase()) {
                case "int":
                    obj = Integer.parseInt(string);
                    System.out.println("\n");
                    System.out.println("Int: " + obj);
                    System.out.println(obj.getClass());
                    break;
                case "double":
                    obj = Double.parseDouble(string);
                    System.out.println("\n");
                    System.out.println("Double: " + obj);
                    System.out.println(obj.getClass());
                    break;
                    case "float":
                    obj = Float.parseFloat(string);
                    System.out.println("\n");
                    System.out.println("Float: " + obj);
                    System.out.println(obj.getClass());
                    break;
                    case "long":
                    obj = Long.parseLong(string);
                    System.out.println("\n");
                    System.out.println("Long: "+ obj);
                    System.out.println(obj.getClass());
                    break;
                default:
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type a string: ");
        String string = sc.nextLine();
        
        System.out.println("Type a number primitive type: ");
        String type = sc.nextLine();

        convertingString(string, type);

    }
}
