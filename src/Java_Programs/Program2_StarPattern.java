//Star Pattern - 1 Program
// *
// * *
// * * *
// * * * *
// * * *
// * *
// *
package Java_Programs;
public class Program2_StarPattern {
    public static void main(String[] args) {
        System.out.println("Star Pattern");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=3;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
