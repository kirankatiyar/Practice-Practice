package Java_Programs;
import java.util.Scanner;
public class Print_TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number , you want print table");
        int a = sc.nextInt();
        System.out.println("table of :="+ a);
        for(int i=1;i<=10;i++){
            int table = a*i;
            System.out.print(table+" , ");
        }
    }
}
