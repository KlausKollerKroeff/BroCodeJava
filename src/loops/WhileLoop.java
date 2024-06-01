package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] args){

        // while loop = executes a block of code as long as a it's condition remains true

        Scanner input = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("What is your name? ");
            name = input.nextLine();
        }

        System.out.println("Hello "+name);
    }
}
