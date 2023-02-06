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
        System.out.println("enter a for Punjabi\n enter b for Hindi\n enter c for english\n enter d for spanish");
        char marks = sc.next().charAt(0);
        // or string marks = sc.next(); but in case it should be in "" like case "a"

     /*switch(marks){

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
                  }*/
        /*if (marks<40){


           //int n=21-marks;
           System.out.println("you are fail ");
        }
        if (marks>40 & marks<=60){


            //int n=21-marks;
            System.out.println("you are good ");
        }
        if (marks>60 & marks<=70){


            //int n=21-marks;
            System.out.println("you are very good ");
        }
        if (marks>70 & marks <=90){


            //int n=21-marks;
            System.out.println("you are excellent ");
        }
        if(marks>90)
        {

            System.out.println("you are champion");
        }*/
        //Date date = new Date();
        switch(marks) {
            case 'a': {
                System.out.println("Punajbi has been selected");
                break;
            }
            case 'b': {
                System.out.println("Hindi has been selected");
                break;
            }
            case 'c': {
                System.out.println("English has been selected");
                break;
            }
            case 'd':
                System.out.println("Spanish has been selected");
                break;

            default:
                System.out.println("wrong input please try again");
        }
}}

