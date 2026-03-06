import java.util.Scanner;


public class CalculatorProject {
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       double num1 ;
       double num2 ;
       double result = 0;

        System.out.print("enter a operator ( + - / * % ) : \t");
        String operator = input.nextLine();
        System.out.println(" \n enter the num 1");
        num1 = input.nextDouble();
        System.out.println("enter the num 2");
        num2 = input.nextDouble();

        switch (operator){
            case "+" :
                result = num1 + num2;
            break;
            case "-" :
                result = num1 - num2;
            break;
            case "*" :
                result = num1 * num2;
            break;
            case "/" :
                result = num1 / num2;
            break;
            case "%" :
                result = num1 % num2;
            break;
            default:
                System.out.println("please enter a valid operator");


        }
        System.out.printf("the result is : %f",result);









       input.close();

    }

}
