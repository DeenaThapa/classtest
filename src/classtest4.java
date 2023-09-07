import java.util.Random;
import java.util.Scanner;

public class classtest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a valid username to log in:");
        String user = sc.next();
        System.out.println("enter a valid password to log in:");
        String password = sc.next();
        if (user.equals("deenathapa") && password.equals("thapadeena")) {
            System.out.println("you are logged in");
            System.out.println("pick a program");
            System.out.println("for calculator:1");
            System.out.println("for guessing game:2");
            System.out.println("for simple interest calculator:3");
            System.out.println("for vowel or consonant: 4");
            int pick = sc.nextInt();
            switch (pick) {
                case 1:
                    System.out.println("calculator picked successfully!");
                    System.out.println("Calculator");
                    double operation = sc.nextDouble();
                    System.out.println("enter any two numbers:");
                    double number1 = sc.nextDouble();
                    double number2 = sc.nextDouble();
                    System.out.println("enter an operator(+,-,*,/):");
                    String operator = sc.next();
                    switch (operator) {
                        case "+":
                            operation = number1 + number2;
                            System.out.println(operation);
                            break;
                        case "-":
                            operation = number1 - number2;
                            System.out.println(operation);
                            break;
                        case "*":
                            operation = number1 * number2;
                            System.out.println(operation);
                            break;
                        case "/":
                            operation = number1 / number2;
                            System.out.println(operation);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("guessing game picked successfully!");
                    System.out.println("guessing game");
                    Random random = new Random();
                    int number = random.nextInt(7);
                    while (true) {
                        System.out.print("enter a random number(1:7): ");
                        int guessed = sc.nextInt();
                        if (guessed == number) {
                            System.out.println("congratulations your guess is correct");
                            break;
                        } else {
                            System.out.println("oh oh you are wrong");
                        }

                    }
                    break;
                case 3:
                    System.out.println("Simple interest calculator picked successfully!");
                    System.out.println("SI calculator");
                    double P , T, R , Simpleinterest;
                    System.out.println("please enter principle!");
                    P = sc.nextDouble();
                    System.out.println("please enter time!");
                    T = sc.nextDouble();
                    System.out.println("please enter rate!");
                    R = sc.nextDouble();
                    Simpleinterest = (P * T * R) / 100;
                    System.out.println(Simpleinterest);
                    break;

                case 4:
                    System.out.println("vowel or consonant picked successfully!");
                    System.out.println("vowel or consonant");
                    System.out.println(" please enter a character :");
                    String character = sc.next();
                    switch (character){
                        case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                            System.out.println("the given character is vowel");
                            break;
                        default:
                            System.out.println("the given character is consonant");


                    }

            }
        }
        else {
            System.out.println("try again with correct username or password");
        }
    }
}