package MP1;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 2/11/2019.
 */
public class FahrenToCelsius {

    private static double convert(double temp){
        //convert fahrenheit to celsius
        return (temp - 32) * 5/9;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //get input from user
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        //convert to 2 decimal places.
        double celsius = Math.round(convert(fahrenheit) * 100.0) / 100.0;

        //print output
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
    }
}
