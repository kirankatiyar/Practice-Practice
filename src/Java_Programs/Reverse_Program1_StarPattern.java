package Java_Programs;
public class Reverse_Program1_StarPattern {
    public static void main(String[] args) {
        System.out.println("Star Pattern");
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
