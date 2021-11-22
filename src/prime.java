import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int a = 2;
        boolean isPrime = true;
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number: ");
        int b = num.nextInt();
        while (a * a <= b){
            if (b % a == 0){
                isPrime = false;
                break;
            }
            a += 1;
        }
        if (isPrime){
            System.out.println("Your number is prime!");
        }
        else {
            System.out.println("Your number is not prime!");

        }
    }
}
