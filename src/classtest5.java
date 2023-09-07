import java.util.Random;
import java.util.Scanner;
public class classtest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a username:");
        String username = sc.next();
        System.out.println("please enter a password:");
        String password = sc.next();
        if (username.equals("name") && password.equals("lol")) {
            System.out.println("!!welcome!!");
            System.out.println("please choose the tool you want to use:");
            System.out.println("1) Calculator");
            System.out.println("2) Guessing game");
            System.out.println("3) SI calculator");
            System.out.println("4) Vowel or Consonant");
            int tool = sc.nextInt();
            if (tool == 1) {
                System.out.println("you picked Calculator!!");
                double a, b, value;
                String operator;
                System.out.println("enter two numbers:");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("enter an operator(+,-,*,/");
                operator = sc.next();


                switch (operator) {
                    case "+":
                        value = a + b;
                        System.out.println("your value is" +(value));
                        break;
                    case "-":
                        value = a - b;
                        System.out.println("your value is" +(value));
                        break;
                    case "*":
                        value = a * b;
                        System.out.println("your value is" +(value));
                        break;
                    case "/":
                        value = a / b;
                        System.out.println("your value is" +(value));

                }


            } else if (tool == 2) {
                System.out.println("you picked guessing game!!");
                Random random = new Random();
                int digits = random.nextInt(100);
                while (true) {
                    System.out.print("enter a number from 1 to 100: ");
                    int guess = sc.nextInt();
                    if (guess == digits) {
                        System.out.println("!!YAYY YOU ARE CORRECT!!");
                        break;
                    } else if (guess < digits) {
                        System.out.println("please try using a smaller number");
                    } else {
                        System.out.println("please try using a bigger number");
                    }


                }
            } else if (tool == 3) {
                System.out.println("you picked SI calculator!");
                System.out.println("please enter principle:");
                double P = sc.nextDouble();
                System.out.println("please enter time:");
                double T = sc.nextDouble();
                System.out.println("please enter rate:");
                double R = sc.nextDouble();
                double SI = (P * T * R)/100;
                System.out.println("the simple interest is" + SI);

            } else if (tool==4) {
                System.out.println("you picked Vowel or Consonant!");

                System.out.println("enter an alphabet:");
                String alphabet = sc.next();
                if (alphabet== "a"){
                    System.out.println("the alphabet is vowel");
                } else if (alphabet=="e"){
                    System.out.println("the alphabet is vowel");
                }
                else if (alphabet=="i"){
                    System.out.println("the alphabet is vowel");
                }
                else if (alphabet=="o"){
                    System.out.println("the alphabet is vowel");
                }
                else if (alphabet=="u"){
                    System.out.println("the alphabet is vowel");
                }
                else {
                    System.out.println("the alphabet is consonant");
                }

            }

            }
            else {
            System.out.println("username or password invalid");
        }

        }
    }

