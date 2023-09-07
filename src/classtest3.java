import java.util.Random;
import java.util.Scanner;

public class classtest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your username:");
        String user = sc.next();
        System.out.println("please enter your password:");
        String password = sc.next();
        if (user.equals("nana") && password.equals("1234")) {
            System.out.println("logged in successfully!!");
            System.out.println("where do you want to go?");
            System.out.println("enter 1 if you want to use calculator");
            System.out.println("enter 2 if you want to play the guessing game");
            System.out.println("enter 3 if you want to calculate simple interest");
            System.out.println("enter 4 if you want to know whether the letter is vowel or consonant");
            int enter = sc.nextInt();
            switch (enter) {
                case 1:
                    System.out.println("thank you for entering 1!");
                    System.out.println("CALCULATOR");
                    double answer = sc.nextDouble();
                    System.out.println("enter two numbers:");
                    double number1 = sc.nextDouble();
                    double number2 = sc.nextDouble();
                    System.out.println("enter an operator(+,-,*,/):");
                    String operator = sc.next();
                    switch (operator) {
                        case "+":
                            answer = number1 + number2;
                            System.out.println("the answer is:" + (answer));
                            break;
                        case "-":
                            answer = number1 - number2;
                            System.out.println("the answer is:" + (answer));
                            break;
                        case "*":
                            answer = number1 * number2;
                            System.out.println("the answer is:" + (answer));
                            break;
                        case "/":
                            answer = number1 / number2;
                            System.out.println("the answer is:" + (answer));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("thank you for entering 2!");
                    System.out.println("GUESSING GAME");
                    Random random = new Random();
                    int anynumber = random.nextInt(10);
                    while (true) {
                        System.out.print("enter a random number from 1 to 10: ");
                        int number = sc.nextInt();
                        if (number == anynumber) {
                            System.out.println("your Guess is Correct");
                            break;
                        } else {
                            System.out.println("try again");
                        }

                    }
                    break;
                case 3:
                    System.out.println("thank you for entering 3!");
                    System.out.println("SI CALCULATOR");
                    System.out.println("enter principle, time and rate");
                    double P = sc.nextDouble();
                    double T = sc.nextDouble();
                    double R = sc.nextDouble();
                    double SI = (P * T * R) / 100;
                    System.out.println(SI);
                    break;

                case 4:
                    System.out.println("thank you for entering 4!");
                    System.out.println("VOWEL OR CONSONANT");
                    System.out.println("enter a character in lower case:");
                    String character = sc.next();
                    if (character == "a") {
                        System.out.println("Vowel");
                    } else if (character == "e") {
                        System.out.println("vowel");
                    } else if (character == "i") {
                        System.out.println("vowel");

                    } else if (character == "o") {
                        System.out.println("vowel");

                    } else if (character == "u") {
                        System.out.println("vowel");

                    } else {
                        System.out.println("consonant");
                    }
                    break;

            }


        }
        else {
            System.out.println("!something went wrong!");
        }
    }
}
