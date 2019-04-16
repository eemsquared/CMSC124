package MP3;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 4/7/2019.
 */
public class ProblemOne {

    private static char[] next = new char[50];
    private static int index = 0;

    private static void digit(){
        expression();

        if (next[index] != '$'){
            System.out.println("Invalid expression.");
        }else {
            System.out.println("Valid expression.");
        }
    }

    private static void expression(){
        pass("expression");
        term();
        while (next[index] == '+' || next[index] == '-'){
            //scan();
            index++;
            term();
        }
        leave("expression");
    }

    private static void term(){
        pass("term");
        factor();
        while (next[index] == '*' || next[index] == '/'){
            index++;
            factor();
        }
        leave("term");
    }

    private static void factor(){
        pass("factor");
        if (next[index] == '0' || next[index] == '1' || next[index] == '2' || next[index] == '3'){
            index++;
        }else if (next[index] =='('){
            index++;
            expression();
            if (next[index] == ')'){
                index++;
            }else {
                System.out.println("Invalid expression.");
                System.exit(1);
            }
        }else {
            System.out.println("Invalid expression.");
            System.exit(1);
        }
        leave("factor");
    }

    private static void pass(String name){
        System.out.print("->" + name + ", \t");
        System.out.println("Next == " + next[index]);
    }

    private static void leave(String name){
        System.out.print("->" + name + ", \t");
        System.out.println("Next == " + next[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter expression: ");
            String input = scanner.nextLine();
            for (int i = 0; i != input.length(); i++) {
                next[i] = input.charAt(i);
            }
            if (next[input.length()-1] != '$'){
                System.out.println("Invalid expression.");
            }else{
                digit();
                index = 0;
            }
            System.out.println();
        }
    }
}
