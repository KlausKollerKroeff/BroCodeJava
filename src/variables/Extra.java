package variables;

import java.util.Scanner;

public class Extra {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        String operator = "";
        int number1, number2,answer;

        System.out.print("Welcome to the calculator!\nEnter the operator here: ");
        operator = input.next();

        while(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("*")&&!operator.equals("/")){
            System.out.println("This is not an operator");
            System.out.println("Write the operator again: ");
            operator = input.next();
        }

        System.out.println("Write the first number: ");
        number1 = input.nextInt();

        System.out.println("Write the second number: ");
        number2 = input.nextInt();

        switch (operator){
            case "+":
                answer = number1+number2;
                System.out.println(number1+"+"+number2+"= "+answer);
                break;
            case "-":
                answer = number1-number2;
                System.out.println(number1+"-"+number2+"= "+answer);
                break;
            case "*":
                answer = number1*number2;
                System.out.println(number1+"*"+number2+"= "+answer);
                break;
            case "/":
                answer = number1/number2;
                System.out.println(number1+"/"+number2+"= "+answer);
                break;
        }

    }
}
