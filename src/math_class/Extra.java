package math_class;

import java.util.Scanner;

public class Extra {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        double z;

        System.out.print("\nHello this is Hypotenuse Calculator!\nWrite here the first number: ");
        x= input.nextInt();

        System.out.println();

        System.out.print("Write here the second number: ");
        y = input.nextInt();

        System.out.println();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse value is: "+z);


    }
}
