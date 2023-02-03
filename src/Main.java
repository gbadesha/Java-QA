import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter 1 for English \n Enter 2 for french \n Enter 3 for punjabi");
    //int a = sc.nextInt();
     /*System.out.println("enter value of b");
     //int b = sc.nextInt();
     if ((a>b) && (a!=b)){
        System.out.println("a>b");
    } else if(a==b) {
        System.out.println("b=a");
    }
     else {
         System.out.println("b>a");
     }*/
        System.out.println("enter a for English \n Enter b for french \n Enter c for punjabi");
        String str = sc.next();
     switch(str){
         case "a":
             System.out.println("speak   in English");
             break;
         case "b":
             System.out.println("speak in f rench");
             break;

         case "c":
             System.out.println("speak in punjabi");
             break;
         default:

             System.out.println("please select proper value");
                  }
}}

