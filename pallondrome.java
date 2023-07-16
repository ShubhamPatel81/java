import java.util.Scanner;
//A palindrome number is a number that is same after reverse. For example 121, 34543, 343, 131, 48984 are the palindrome numbers.
public class pallondrome {
    public  static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int num = 0;
        int reverse  = 0;
        int count =0 ;
        while (temp!=0){

            num = temp % 10;
            reverse = reverse * 10 + num;
            temp /= 10;
        }
        if (n == reverse){
            System.out.println("number is palindrome");
        }else{
            System.out.println("Number is not a palindrome ");
        }
    }
}
