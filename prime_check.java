import javax.swing.plaf.synth.SynthLookAndFeel;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
//A prime number is a number that is divisible by only two numbers: 1 and itself

public class prime_check {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check ");
        int num = sc.nextInt();
        // Checking the number

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                count++;
                break;
            }

        }
        if (count == 0){
            System.out.println(num + " is a prime number ");
        }else{
            System.out.println(num + " is not a prime number ");
        }
    }}