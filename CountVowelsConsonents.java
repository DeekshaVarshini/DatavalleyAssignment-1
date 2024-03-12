import java.util.*;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); 
        //count vowels and consonents
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
			else {
                    consonants++;
                }
            }
        }

       //output 
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}
