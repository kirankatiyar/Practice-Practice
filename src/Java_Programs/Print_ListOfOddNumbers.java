package Java_Programs;
import java.util.Scanner;
public class Print_ListOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ,From 1 to witch number ,you want print odd number");
        int no = sc.nextInt();
        System.out.println("List of odd numbers from 1 to"+" "+no);
        for(int i=1;i<=no;i++) {
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }
}
