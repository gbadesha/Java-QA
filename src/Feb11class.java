import java.util.Scanner;

public class Feb11class {

    public static void main(String[] args){
                Scanner s= new Scanner(System.in);
                int n=0;
                do{
        System.out.println("Enter 1 for addition\n Enter 2 for subtraction\n Enter 3 for multiplication\n Enter 4 to divide\n Enter 5 to exit");
        n=s.nextInt();
        if(n==5){
            System.out.println("You opt for exit");
            break;
        }
        int a,b,c;

        System.out.println("Enter the value of first number");
        a=s.nextInt();
        System.out.println("Enter the value of second number");
        b=s.nextInt();

                switch(n){
            case 1:
                sum(a,b);
                break;
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            case 4:
                div(a,b);
                break;

        }} while(n!=5);

    }
      public static void sum(int s1,int s2){
        int s=s1+s2;
        System.out.println("Sum of numbers is = " + s );

    }
    public static void sub(int s1, int s2){
        int s=s1-s2;
        System.out.println("Subtraction of numbers is = " + s );

    }
    public static void mul(int s1,int s2){
        int s=s1*s2;
        System.out.println("Multiplication of numbers is = " + s );
    }
    public static void div(int s1,int s2){
        int s=s1/s2;
        int d = s1%s2;
        System.out.println("division of numbers is = " + s + " Remainder is = " + d);
    }
    //public static exit(){

    //}
}
