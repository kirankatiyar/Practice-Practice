package Java_Programs;
import java.util.Scanner;
public class CountTotalNoOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Total No of Odd Numbers Between 1 to no");
        System.out.println("Enter any number ,From 1 to which number ,you want print odd number");
        int count=0;
        int no = sc.nextInt();
        for(int i=1;i<=no;i++){
            if(i%2!=0){
                count = count+1;
            }
        }
        System.out.println("total no of odd numbers between 1 to "+no+" = "+count);
    }
}
