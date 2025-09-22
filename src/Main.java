import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n------BASIC CALCULATOR-------\n");
        Scanner sc = new Scanner(System.in);
        char repeat='N';   //by default no repetition
        int count=0;       // No. of Calculation


     do {                     //atleast first calculation has to execute
         count++;

         System.out.println("                                       calculation number:"+count);

         System.out.print("Enter the first number:");
         double firstNum = sc.nextDouble();

         System.out.print("Enter the operator(+,-,/,*):");
         char operator = sc.next().charAt(0);

         System.out.print("Enter the second number:");
         double secondNum = sc.nextDouble();



         switch (operator) {

             case '+':
                 if (firstNum % 1 == 0 && secondNum % 1 == 0) {
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println((int) firstNum + " + " + (int) secondNum + " = " + ((int) (firstNum + secondNum)));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 } else {
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 }

                 break;

             case '-':
                 if (firstNum % 1 == 0 && secondNum % 1 == 0) {
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println((int) firstNum + " - " + (int) secondNum + " = " + ((int) (firstNum - secondNum)));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 } else {

                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 }
                 break;

             case '*':
                 if (firstNum % 1 == 0 && secondNum % 1 == 0) {

                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println((int) firstNum + " * " + (int) secondNum + " = " + ((int) (firstNum * secondNum)));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 } else {

                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 }
                 break;

             case '/':
                 try {
                     if (firstNum % 1 == 0 && secondNum % 1 == 0) {
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                         System.out.println((int) firstNum + " / " + (int) secondNum + " = " + ((firstNum / secondNum)));
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     } else {
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                         System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     }


                 } catch (ArithmeticException e) {
                     e.toString();
                 }
                 break;

             default:
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 System.out.println("Please enter valid operator");
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         }
         System.out.print("Do you want to calculate again:(Y/N)->");
         repeat=sc.next().charAt(0);
         System.out.println("________________________________________________________________________________________________________________");

     }while (repeat=='Y'|| repeat=='y');


    }
}