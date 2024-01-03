package Java_Programs;
import java.util.Scanner;
public class DetermineLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" To check whether the year is a leap year or not, enter any year");
        //100 year ke bad reapeate hone vala year centuri year hota he, 2100, 1900
        //centuri year always 100 se divisible hote hen
        //A common year has 365 days, but a leap year has 366 days. The extra day, February 29, is added to the month of February.
        // fully divisible by 4, it is a leap year.Century years like 300, 700, 1900, 2000 need to be divided by 400 .
        int year = sc.nextInt();
        if((year%400==0)||(year%4==0&&year%100!=0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
