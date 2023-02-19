import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //int k = 19000;
        String[] array = new String[10];
        array[1]="Gurpreet";
        array[3]="Sunny";
        array[5]="Inayat";
        array[7]="Ustat";
       //String s = "Gurpreet";
        for(int i=array.length-1;i>=0;i--)
        {
              if(array[i]=="Inayat") {
                  //array[i]=s;

                  System.out.println("Location of Inayat is " + i);
              break;
              }}
           // k++;

        ArrayClass obj= new ArrayClass(5,4); // constructor called based on parameters

        Scanner sc = new Scanner(System.in);
              System.out.println("Enter array size");
              obj.a=sc.nextInt();

              obj.whatevermethod();

        }}








