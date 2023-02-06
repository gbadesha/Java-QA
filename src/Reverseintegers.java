import java.util.Scanner;

public class Reverseintegers {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        int z;
        System.out.println("Enter the digits");
        n=s.nextInt();
        System.out.println("Reverse number is");
        while(n>0){
            z=n%10;
            System.out.print(z);
            n=n/10;

        }


    }
}
