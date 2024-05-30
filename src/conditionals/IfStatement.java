package conditionals;

import java.util.Scanner;

public class IfStatement {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("How old are you? ");
        age = input.nextInt();

        System.out.println();

        if (age>=100){
            System.out.println("You are probalyyy dead :(");
        }
        else if (age>=60 && age<=99){
            System.out.println("Ok boomer!");
        }
        else if (age>18 && age<60){
            System.out.println("You are an adult!");
        }
        else if(age==14){
            System.out.println("You have the same age as Klaus!");
        }
        else if(age>=12 && age<=18){
            System.out.println("You are a teenager");
        }
        else if (age>3 && age<12){
            System.out.println("Kid!!!");
        }
        else{
            System.out.println("You are a baby!");
        }

    }
}
