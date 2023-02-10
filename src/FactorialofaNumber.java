import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args){
        int n;
        int z=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Factorial Program\n" + "Enter the number\n");
                n=s.nextInt();
        while(n>1){
            z=z*n;
            n--;
        }
        System.out.println("Factorial is   " + z);
    }
}
