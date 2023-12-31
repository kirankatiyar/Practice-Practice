package Java_Programs;
import java.util.Scanner;
public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("First number a =  "+a);
        System.out.print("  &  ");
        System.out.println("second number b =  "+b);
        if(a>b){
            System.out.println("a is gretar than b");
        }
        else if(a<b){
            System.out.println("b is gretar than a");
        }
        else{
            System.out.println("a & b,both number are equals");
        }
    }
}
