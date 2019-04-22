package MP3;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 4/14/2019.
 */
public class Problem2 {

    private static char[] next = new char[100];
    private static int index = 0;

    private static void pass(){
        expression();

        if (next[index] != '$'){
            System.out.println("Invalid string.");
        }else {
            System.out.println("Valid string.");
        }
    }

    private static void expression(){
        enter("expression");
        if (next[index] == '+' || next[index] == '-'){
            index++;
            number();
        }else {
            number();
        }
        leave("expression");
    }

    private static void number(){
        enter("number");
        digits();
        while (next[index] == '.'){
            index++;
            digits();
        }
        leave("number");
    }

    private static void digits(){
        enter("digits");
        digit();

        while (next[index] == '0' || next[index] == '1' || next[index] == '2' || next[index] == '3' ||
                next[index] == '4' || next[index] == '5' || next[index] == '6' || next[index] == '7' ||
                next[index] == '8' || next[index] == '9'){
            index++;
            digit();
        }
        leave("digits");
    }

    private static void digit(){
        enter("digit");
        if (next[index] == '0' || next[index] == '1' || next[index] == '2' || next[index] == '3' ||
                next[index] == '4' || next[index] == '5' || next[index] == '6' || next[index] == '7' ||
                next[index] == '8' || next[index] == '9'){
            index++;
        }
        leave("digit");
    }

    private static void enter(String name){
        System.out.print("enter->" + name + ", \t");
        System.out.println("Next == " + next[index]);
    }

    private static void leave(String name){
        System.out.print("leave ->" + name + ", \t");
        System.out.println("Next == " + next[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter string: ");
            String input = scanner.nextLine();
            for (int i = 0; i != input.length(); i++) {
                next[i] = input.charAt(i);
            }
            int count = 0;
            for (int i = 0; i < input.length(); i++){
                if (next[i] == '.'){
                    count++;
                }
            }
            if (next[input.length()-1] != '$'){
                System.out.println("Invalid string.");
            }
            else if (count >= 2){
                System.out.println("Invalid string.");
            }
            else{
                pass();
                index = 0;
            }
            System.out.println();
            System.out.println("done");
        }
    }
}
