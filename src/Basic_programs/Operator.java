package Basic_programs;

import java.util.Scanner;
public class Operator {
    public static void main(String[] args){
        /*int x=10;
        int y;
        int z;
        // x++
        System.out.println("you 1 to post increment x\n enter 2 to preincrement x");
        Scanner sc=new Scanner(System.in);
        z=sc.nextInt();
        //y=x++; // put x into y but increament will be done in x only
        //++y;
        switch(z) {
            case 1:
               y=x++;
                System.out.println("X=" + x);
                System.out.println("Y=" + y);

                break;
            case 2:
                y=++x;
                System.out.println("X=" + x);
                System.out.println("Y=" +y);
                break;
            default:
                System.out.println("value is still same");
                break;
        }*/
        /*int x=1;
        int z;
        System.out.println("Print table of 2 \n");
        Scanner t = new Scanner(System.in);
        System.out.println("enter which number table you want");
        int k = t.nextInt();
        while(x<=10)
        {
            z= k * x;
            System.out.print( k + " * " + x + " = " + z + "\n");
        //System.out.print(" = " + z);
        //System.out.println("\n");
                    x++;
        }*/
        int x=1;
        int z=0;
        System.out.println("printing numbers from 1 to 10 and their sum");
        //Scanner t = new Scanner(System.in);
        //System.out.println("enter which number table you want");
        //int k = t.nextInt();
        while(x<=10) {
            //z= k * x;
            System.out.print(x + "+");
            z = x + z;
            x++;

        }
        System.out.println("\nSum is " + z);
    }
}
