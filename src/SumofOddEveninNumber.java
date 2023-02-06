import java.util.Scanner;

public class SumofOddEveninNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int z;
        int a = 0;
        int b = 0;
        System.out.println("Enter the digits");
        n = s.nextInt();
        //System.out.println("Reverse number is");
        while (n > 0) {
            z = n % 10;
            if (z % 2 == 0) {
                a = a + z;
            } else {
                b = b + z;
            }


            //System.out.print(z);
            n = n / 10;

        }
        System.out.println("Sum of even numbers is " + a);
        System.out.println("Sum of odd numbers is " + b);


    }
    }
