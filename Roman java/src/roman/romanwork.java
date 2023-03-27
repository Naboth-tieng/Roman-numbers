package roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class romanwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int decimalValue = romanToDecimal(romanNumeral);
        if (decimalValue == 0) {
            System.out.println("Invalid Roman numeral!");
        } else {
            System.out.println("The decimal value of " + romanNumeral + " is " + decimalValue);
        }
    }
    
    public static int romanToDecimal(String romanNumeral) {
       HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int decimalValue = 0;
        int previousValue = 0;
        char previous=' ';
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            if (!romanValues.containsKey(c)) {
                // Invalid Roman numeral
                return 0;
            }
            if((c==previous) && (c=='L'||c=='V'||c=='D')) {
            	return 0;
            }
            int currentValue = romanValues.get(c);
            if (currentValue < previousValue) {
                decimalValue -= currentValue;
            } else {
                decimalValue += currentValue;
            }
            previousValue = currentValue;
            previous=c;
        }
        return decimalValue;
    }
}

