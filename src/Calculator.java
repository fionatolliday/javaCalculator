import java.util.Scanner;

public class Calculator {


    public static void main(String[] args){
        Calculator myCalc = new Calculator();
        int number1 = myCalc.getUserFirstNumber();
        int number2 = myCalc.getUserSecondNumber();


        Maths mathsCalculator = new Maths();

        System.out.println("The sum of the two numbers is: " + mathsCalculator.addNumbers(number1
                ,number2));
        System.out.println("The two numbers multiplied are: " + mathsCalculator.multiplyNumbers(number1, number2));
        System.out.println("When the first number is divided by the second number, you get: " + mathsCalculator.divideNumbers(number1, number2));
        System.out.println("When the second number is subtracted from the first number, you get " + mathsCalculator.subtractNumbers(number1,  number2));
    }

    public int getUserFirstNumber(){
        System.out.println("Please enter a number: ");
        Scanner userInput = new Scanner(System.in);
        int readUserInput = userInput.nextInt();
        return readUserInput;
}

    public int getUserSecondNumber(){
        System.out.println("Please enter another number: ");
        Scanner userInput = new Scanner(System.in);
        int readUserInput = userInput.nextInt();
        return readUserInput;
    }

}



//    Create a new class Calculator
//
//        Add accepts integers
//        Multiply accepts integers
//        Divide accepts integers
//        Subtract accepts integers
//        Recall - no parameters just returns the previous value
//
//        - decide on return type of the functions
//        - Maximum input for integers can be int.max value and minimum input can be int.min_value
//        - Do not use static keyword except for the Main function