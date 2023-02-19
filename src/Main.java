import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studentdata student1 = new Studentdata("Gurpreet",20,30,40);
        //Studentdata student2 = new Studentdata("Inayat",30,4,50);
        //Studentdata student3 = new Studentdata("Ustat",40,50,5);
        Studentdata student2= new Studentdata("sunny");
        //student1.name= "Sunny";
        //student1.math =10;
        //student1.chem=5;
        //student1.sci = 50;
        //Studentdata student2= new Studentdata();*/
        //student1.r=100;
        //System.out.println(Studentdata("Gurpreet",10,20,30));

       System.out.println(student1.name("Inayat") + " is having total " + student1.marks(30,40,50) + " marks");
        System.out.println(student1.name("Ustat") + " is having total " + student1.marks(30,40,50) + " marks");
        //System.out.println(student1.name("Gurpreet") + " is having total marks " );
            }
}