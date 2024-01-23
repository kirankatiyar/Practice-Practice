package Java_Programs;
import java.util.Scanner;
public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int number = sc.nextInt();
        System.out.println("Generate Prime numbers between 1 to  " + number);
        for(int i=1;i<=number;i++){
            int temp = 0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.print(i +",");
            }
            else{
                temp=0;
            }
        }
    }
}
