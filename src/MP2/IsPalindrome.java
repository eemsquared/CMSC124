package MP2;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 3/5/2019.
 */
public class IsPalindrome {

    static String newString;

    public static boolean checkIfPalindrome(String word){
        newString = word.replaceAll(" ", "");                    //remove spaces
        newString = newString.replaceAll("[^a-zA-Z]", "");       //remove non-alphabetic characters
        newString = newString.toLowerCase();                                      //convert to lowercase

        try {
            if (newString.isEmpty()){
                System.out.println("Invalid input.");
                return false;
            }
        }catch (Exception e){
            //invalid input
        }

        System.out.println("DERIVATION:");
        if (newString.length() == 1){
            System.out.println("<palindrome> ::= <letter>\n\t::= " + word);
            return true;
        }
        if (newString.length() == 2){
            if (word.charAt(0) == word.charAt(1)){
                System.out.println("<palindrome> ::= " + word);
                return true;
            }
        }
        String strCopy = newString;
        int start = 0;
        int end = newString.length()-1;

        if (newString.charAt(0) == newString.charAt(newString.length()-1)){
            System.out.println("<palindrome>");
        }
        while (start != (strCopy.length()/2)){
            if (newString.charAt(0) == newString.charAt(newString.length()-1)){
                System.out.println("\t::= " + strCopy.substring(0, start+1) + " <palindrome> " + strCopy.substring(end));
                newString = newString.substring(1, newString.length()-1);
                //System.out.println(newString + "<--- new");
                start++;
                end--;
            }
            else {
                System.out.println(word + " is not a palindrome.");
                return false;
            }
        }
        if (newString.length() % 2 != 0){
            System.out.println("\t::= " + strCopy.substring(0, start) + " <letter> " + strCopy.substring(end+1));
            System.out.println("\t::= " + strCopy.substring(0, start) + strCopy.charAt(strCopy.length()/2) + strCopy.substring(end+1));
            return true;
        }
        else {
            System.out.println("\t::= " + strCopy.substring(0, start) + "" + strCopy.substring(end+1));
        }


        //System.out.println(newString);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PALINDROME GRAMMAR\n" +
                "<palindrome> ::= a <palindrome> a | b <palindrome> b |\n" +
                "                 c <palindrome> c | d <palindrome> d | \n" +
                "                 e <palindrome> e | ...\n" +
                "                                  | z <palindrome> z\n" +
                "                 aa | bb | cc | ... | zz\n" +
                "<palindrome> ::= <letter>\n" +
                "<letter> ::= a | b | c | ... | y | z |\n");
        do {
            System.out.println("Enter word: ");
            String input = scanner.nextLine();
            boolean check = checkIfPalindrome(input);
            System.out.println();
        }while (true);
    }
}
