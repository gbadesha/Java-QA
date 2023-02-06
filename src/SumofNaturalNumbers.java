public class SumofNaturalNumbers {
    public static void main(String[] args){
        System.out.println("Sum of first 10 natural numbers");
        int n=0,z=0;
        while(n<=10){
           System.out.print(n);
           if (n<10)
           { System.out.print(" + ");}
            z=z+n++;}

                System.out.println("\nSum is  " + z);
    }
}
