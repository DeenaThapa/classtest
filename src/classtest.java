import java.util.Random;
import java.util.Scanner;

public class classtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter username:");
        String username = sc.next();
        System.out.println("enter password:");
        String password = sc.next();
        if (username.equals("user") && password.equals("password")) {
            System.out.println("logged in!");
            System.out.println("choose between:");
            System.out.println("1. Calculator");
            System.out.println("2. Guessing game");
            System.out.println("3. SI calculator");
            System.out.println("4. Vowel or Consonant");
            int select = sc.nextInt();
            if (select == 1) {
                System.out.println("Calculator");
                double num1, num2, result;
                String operator;
                System.out.println("enter 2 num:");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("enter an operator(+,-,*,/");
                operator = sc.next();


                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case "/":
                        result = num1 / num2;
                        System.out.println(result);

                }


            } else if (select == 2) {
                System.out.println("Guessing game");
                Random random = new Random();
                int randomnumber = random.nextInt(100);
                while (true) {
                    System.out.print("enter a random number: ");
                    int guess = sc.nextInt();
                    if (guess == randomnumber) {
                        System.out.println("your Guess is Correct");
                        break;
                    } else if (guess < randomnumber) {
                        System.out.println("try High.");
                    } else {
                        System.out.println("try Low.");
                    }


                }
            } else if (select == 3) {
                System.out.println("SI calculator");
                double P, T, R, SI;
                System.out.println("enter principle:");
                P = sc.nextDouble();
                System.out.println("enter time:");
                T = sc.nextDouble();
                System.out.println("enter rate:");
                R = sc.nextDouble();
                SI = ((double) P * T * R) / 100;
                System.out.println(SI);

            } else if (select==4) {
                System.out.println("Vowel or Consonant");

                System.out.println("enter a letter:");
                String letter = sc.next();
                switch (letter) {
                    case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");


                }

            }

        }
        else {
            System.out.println("!!!!error!!!!");
        }
    }
}

