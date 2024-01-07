package Java_Programs;
import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("If the number is equal to it's reversed number, then the given number is a palindrome number.");
        System.out.println("Enter any number to check , is Palindrom Number or not");
        int number = sc.nextInt();
        int reversed_number = 0;
        int temp = number;
        while(number!=0){
            int remender = number%10;
            reversed_number = reversed_number*10+ remender;
            number = number/10;
        }
        System.out.println("reversed_number : = "+reversed_number);
        if(temp == reversed_number){
            System.out.println("Number is Palindrome number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
