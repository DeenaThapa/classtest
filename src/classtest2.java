import java.util.Random;
import java.util.Scanner;
public class classtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your username to login ");
        String username = sc.next();
        System.out.println("enter your password");
        String password = sc.next();

        if (username.equals("deena") && password.equals("lol123")) {
            System.out.println("logged in successfully");
            System.out.println("Choose from the following:");
            System.out.println("1 = calculator");
            System.out.println("2 = guessing game");
            System.out.println("3 = SI calculator");
            System.out.println("4 = vowel or consonant detector");
            int choose = sc.nextInt();

            if (choose== 1){
                System.out.println("congratulations on picking calculator");
                int result;
                System.out.println("choose 2 numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("choose an operator(+,_,*,/):");
                String operator = sc.next();
                 switch (operator){
                     case "+":
                         result = num1 + num2;
                         System.out.println("the result is:" + (result));
                     break;
                     case "-":
                         result = num1 - num2;
                         System.out.println("the result is:" + (result));
                     break;
                     case "*":
                         result = num1*num2;
                         System.out.println("the result is:" + (result));
                     break;
                     case "/":
                         result = num1/num2;
                         System.out.println("the result is:" +(result));
                     break;
                 }
            } else if (choose==2) {
                System.out.println("congratulations on picking guessing game");
                Random random = new Random();
                int number = random.nextInt(1000);
                while (true){
                    System.out.println("enter an number from 1 to 1000:");
                    int guessednumber = sc.nextInt();
                    if (guessednumber== number){
                        System.out.println("your Guess is Correct");
                        break;
                    } else if (number < guessednumber) {
                        System.out.println("too high");
                    } else {
                        System.out.println("too low");
                    }




                }

            } else if (choose==3) {
                System.out.println("congratulations on picking SI calculator!");
                System.out.println("enter principle:");
                double P = sc.nextDouble();
                System.out.println("enter time in years:");
                double T = sc.nextDouble();
                System.out.println("enter rate in percentage:");
                double R = sc.nextDouble();
                double SI = (P * T * R)/100;
                System.out.println("Your simple interest is" + SI);

            } else if (choose== 4) {
                System.out.println("congratulations on picking vowel or consonant detector!");
                System.out.println("please enter a letter:");
                String input = sc.next();

                switch (input){
                    case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                        System.out.println("the letter you entered is Vowel");
                        break;
                    default:
                        System.out.println("the letter you entered is Consonant");
                }



            }

        }
        else {
            System.out.println("please enter valid username or password");
        }
    }

}
