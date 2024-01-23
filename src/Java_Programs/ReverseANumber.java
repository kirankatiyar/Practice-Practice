package Java_Programs;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int revse =0;
        while(number!=0){
            int remder = number%10;
            revse = revse*10+remder;
            number=number/10;
        }
        System.out.println("Reverse Number is: "+revse);
    }
}
